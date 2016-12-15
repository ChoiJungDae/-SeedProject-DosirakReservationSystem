package seed.edu.dosirak.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

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

	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
		 
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
 
   
   
// �뜝�룞�삕�뜝�룞�삕, �뜝�룞�삕�뜝�룞�삕 �뜝�뙥怨ㅼ삕 ---------------------------------------------------------    
    memberVO.setAuth(Tool.key()); // ABC012345678901234
    memberVO.setDropout("N");
     
    if (memberDAO.admin_search("M") == 0){ // �뜝�떆琉꾩삕�뜝�룞�삕, �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕
      msgs.add("�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝占� �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 Master �뜝�룞�삕�뜝�룞�삕�뜝�뙃�땲�뙋�삕.<br><br>");
      memberVO.setAct("M");  // �뜝�뙇怨ㅼ삕 �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕
      memberVO.setConfirm("Y"); //  �뜝�뙇怨ㅼ삕 �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕 �솗�뜝�룞�삕 泥섇뜝�룞�삕
    }else{
      memberVO.setAct("H");  // �뜝�룞�삕�뜝�룞�삕�뜝�뙓怨ㅼ삕 �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�떗�슱�삕�뜝�룞�삕, H: hold.
      memberVO.setConfirm("N"); // �뜝�룞�삕�뜝�룞�삕 �솗�뜝�룞�삕 �뜝�떕�벝�삕, �뜝�룞�삕�뜝�룞�삕�뜝�뙓怨ㅼ삕 �뜝�룞�삕�뜝�룞�삕 �솗�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕. 
    }
    // ---------------------------------------------------------     
 // �뜝�룞�삕艅섇뜝�떕占� �뜝�룞�삕�샇�솕
 // ---------------------------------------------------------     
     System.out.println("�뜝�룞�삕艅섇뜝�떕占� �뜝�룞�삕�샇�솕 �뜝�룞�삕: "+memberVO.getM_id());
     
     AES256Util aes256 = new AES256Util();
     String encrypt_pwd = aes256.aesEncode(memberVO.getM_id());
     memberVO.setM_id(new String(encrypt_pwd));
     System.out.println("�뜝�룞�삕艅섇뜝�떕占� �뜝�룞�삕�샇�솕 �뜝�룞�삕"+memberVO.getM_id());
 // ---------------------------------------------------------     
     if (memberDAO.create(memberVO) == 1) {
       msgs.add("�쉶�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 泥섇뜝�룞�삕 �뜝�떎�뼲�삕�뜝�룞�삕�뜝�떦�뙋�삕.");
       msgs.add("�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�뙇�뀛�눦�삕 �뜝�룞�삕�뜝�룞�삕�뜝�뙆�땲�뙋�삕.");
       msgs.add("�뜝�떛紐뚯삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕 �뜝�떥源띿삕�뜝�룞�삕�뜝�룞�삕 �뜝�룞�삕�뜝�룞�삕�뜝�뙆�땲�뙋�삕.");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">�솃�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕</button>");
     } else {
       msgs.add("�쉶�뜝�룞�삕 �뜝�룞�삕�뜝�뙃�슱�삕 �뜝�룞�삕�뜝�룞�삕�뜝�뙥�룞�삕�뜝�떦�뙋�삕.");
       msgs.add("�뜝�떙�눦�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�뙐�룞�삕�뜝�떬諭꾩삕 �뜝�떆�벝�삕�뜝�룞�삕�뜝�뙇�눦�삕�뜝�룞�삕.");
       links.add("<button type='button' onclick=\"history.back()\">�뜝�뙐�떆�떆�벝�삕</button>");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">�솃�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕</button>");
     }
  
     mav.addObject("msgs", msgs);
     mav.addObject("links", links);
  
     return mav;
   }*/
 
=======
>>>>>>> 65305da7ca707941c1157ef5ac9b555bf2e85d51
}
