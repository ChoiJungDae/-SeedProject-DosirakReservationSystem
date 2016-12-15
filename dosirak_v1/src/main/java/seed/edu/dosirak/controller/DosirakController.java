package seed.edu.dosirak.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import seed.edu.dosirak.service.DosirakService;

@Controller
public class DosirakController {
	
/* @Autowired 
 @Qualifier("seed.edu.dosirak.dao.DosirakDAO")
 private DosirakService memberDAO;*/
 
 @Resource(name="DosirakService")
 private DosirakService memberDAO;
 
 @RequestMapping(value="/index.do")
	 public ModelAndView index(){

		 ModelAndView mv  = new ModelAndView("index");
		 return mv;
	 }
 
 @RequestMapping(value="/hello.do")
 public ModelAndView hello(){
	 ModelAndView mv  = new ModelAndView("jsp/hello");
	 return mv;
 }
 
/* @RequestMapping(value = "/member/create.do", method = RequestMethod.GET)
 public ModelAndView create() {
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("/member/create");
=======

	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______������ ���� Ȯ��____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______������ ���� Ȯ��____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______������ ���� Ȯ��____");
		 
	 ModelAndView mv  = new ModelAndView("index");
	
	 return mv;
>>>>>>> 65305da7ca707941c1157ef5ac9b555bf2e85d51
	 
 }

<<<<<<< HEAD
 @RequestMapping(value = "/member/create.do", method = RequestMethod.POST)
 public ModelAndView create(MemberVO memberVO ) throws Exception {
   System.out.println("--> create() POST called.");
   ModelAndView mav = new ModelAndView();
   mav.setViewName("/member/message"); // /webapp/member/message.jsp

   ArrayList<String> msgs = new ArrayList<String>();
   ArrayList<String> links = new ArrayList<String>();
 
   
   
// 占쏙옙占쏙옙, 占쏙옙占쏙옙 占쌩곤옙 ---------------------------------------------------------    
    memberVO.setAuth(Tool.key()); // ABC012345678901234
    memberVO.setDropout("N");
     
    if (memberDAO.admin_search("M") == 0){ // 占시뤄옙占쏙옙, 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
      msgs.add("占쏙옙占쏙옙 占쏙옙占� 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 Master 占쏙옙占쏙옙占쌉니댐옙.<br><br>");
      memberVO.setAct("M");  // 占쌍곤옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
      memberVO.setConfirm("Y"); //  占쌍곤옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 확占쏙옙 처占쏙옙
    }else{
      memberVO.setAct("H");  // 占쏙옙占쏙옙占쌘곤옙 占쏙옙占쏙옙占쏙옙 占십울옙占쏙옙, H: hold.
      memberVO.setConfirm("N"); // 占쏙옙占쏙옙 확占쏙옙 占싫듸옙, 占쏙옙占쏙옙占쌘곤옙 占쏙옙占쏙옙 확占쏙옙 占쏙옙占쏙옙. 
    }
    // ---------------------------------------------------------     
 // 占쏙옙橘占싫� 占쏙옙호화
 // ---------------------------------------------------------     
     System.out.println("占쏙옙橘占싫� 占쏙옙호화 占쏙옙: "+memberVO.getM_id());
     
     AES256Util aes256 = new AES256Util();
     String encrypt_pwd = aes256.aesEncode(memberVO.getM_id());
     memberVO.setM_id(new String(encrypt_pwd));
     System.out.println("占쏙옙橘占싫� 占쏙옙호화 占쏙옙"+memberVO.getM_id());
 // ---------------------------------------------------------     
     if (memberDAO.create(memberVO) == 1) {
       msgs.add("회占쏙옙占쏙옙占쏙옙占쏙옙 처占쏙옙 占실억옙占쏙옙占싹댐옙.");
       msgs.add("占쏙옙占쏙옙占쏙옙占쌍셔쇽옙 占쏙옙占쏙옙占쌌니댐옙.");
       msgs.add("占싱몌옙占쏙옙 占쏙옙占쏙옙 占쏙옙 占싸깍옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">홈占쏙옙占쏙옙占쏙옙</button>");
     } else {
       msgs.add("회占쏙옙 占쏙옙占쌉울옙 占쏙옙占쏙옙占쌩쏙옙占싹댐옙.");
       msgs.add("占싯쇽옙占쏙옙占쏙옙占쏙옙 占쌕쏙옙占싼뱄옙 占시듸옙占쏙옙占쌍쇽옙占쏙옙.");
       links.add("<button type='button' onclick=\"history.back()\">占쌕시시듸옙</button>");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">홈占쏙옙占쏙옙占쏙옙</button>");
     }
  
     mav.addObject("msgs", msgs);
     mav.addObject("links", links);
  
     return mav;
   }*/

}
