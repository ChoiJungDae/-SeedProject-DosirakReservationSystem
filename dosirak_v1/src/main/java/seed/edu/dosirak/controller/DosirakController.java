package seed.edu.dosirak.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import seed.edu.dosirak.service.DosirakService;
import seed.edu.dosirak.vo.MemberVO;
import web.tool.AES256Util;
import web.tool.Tool;

@Controller
public class DosirakController {
 @Autowired 
 @Qualifier("seed.edu.dosirak.dao.DosirakDAO")
 private DosirakService memberDAO;
 
 @RequestMapping("index")
	 public ModelAndView index(){
		 ModelAndView mv  = new ModelAndView("index");
		 return mv;
	 }
 @RequestMapping(value = "/member/create.do", method = RequestMethod.GET)
 public ModelAndView create() {
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("/member/create");
	 
	 return mav;
 }

 @RequestMapping(value = "/member/create.do", method = RequestMethod.POST)
 public ModelAndView create(MemberVO memberVO ) throws Exception {
   System.out.println("--> create() POST called.");
   ModelAndView mav = new ModelAndView();
   mav.setViewName("/member/message"); // /webapp/member/message.jsp

   ArrayList<String> msgs = new ArrayList<String>();
   ArrayList<String> links = new ArrayList<String>();
 
   
   
// 권한, 인증 추가 ---------------------------------------------------------    
    memberVO.setAuth(Tool.key()); // ABC012345678901234
    memberVO.setDropout("N");
     
    if (memberDAO.admin_search("M") == 0){ // 컬럼명, 마스터 계정
      msgs.add("최초 등록 계정임으로 Master 계정입니다.<br><br>");
      memberVO.setAct("M");  // 최고 관리자 지정
      memberVO.setConfirm("Y"); //  최고 관리자임으로 메일 확인 처리
    }else{
      memberVO.setAct("H");  // 관리자가 승인이 필요함, H: hold.
      memberVO.setConfirm("N"); // 메일 확인 안됨, 가입자가 메일 확인 안함. 
    }
    // ---------------------------------------------------------     
 // 비밀번호 암호화
 // ---------------------------------------------------------     
     System.out.println("비밀번호 암호화 전: "+memberVO.getM_id());
     
     AES256Util aes256 = new AES256Util();
     String encrypt_pwd = aes256.aesEncode(memberVO.getM_id());
     memberVO.setM_id(new String(encrypt_pwd));
     System.out.println("비밀번호 암호화 후"+memberVO.getM_id());
 // ---------------------------------------------------------     
     if (memberDAO.create(memberVO) == 1) {
       msgs.add("회원가입이 처리 되었습니다.");
       msgs.add("가입해주셔서 감사합니다.");
       msgs.add("이메일 인증 시 로그인이 가능합니다.");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">홈페이지</button>");
     } else {
       msgs.add("회원 가입에 실패했습니다.");
       msgs.add("죄송하지만 다시한번 시도해주세요.");
       links.add("<button type='button' onclick=\"history.back()\">다시시도</button>");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">홈페이지</button>");
     }
  
     mav.addObject("msgs", msgs);
     mav.addObject("links", links);
  
     return mav;
   }
 
}
