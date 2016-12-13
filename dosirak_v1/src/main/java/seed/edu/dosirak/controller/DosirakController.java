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
 
 @RequestMapping(value="/index")
	 public ModelAndView index(){
		 ModelAndView mv  = new ModelAndView("index");
		 return mv;
	 }
 
/* @RequestMapping(value = "/member/create.do", method = RequestMethod.GET)
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
 
   
   
// ����, ���� �߰� ---------------------------------------------------------    
    memberVO.setAuth(Tool.key()); // ABC012345678901234
    memberVO.setDropout("N");
     
    if (memberDAO.admin_search("M") == 0){ // �÷���, ������ ����
      msgs.add("���� ��� ���������� Master �����Դϴ�.<br><br>");
      memberVO.setAct("M");  // �ְ� ������ ����
      memberVO.setConfirm("Y"); //  �ְ� ������������ ���� Ȯ�� ó��
    }else{
      memberVO.setAct("H");  // �����ڰ� ������ �ʿ���, H: hold.
      memberVO.setConfirm("N"); // ���� Ȯ�� �ȵ�, �����ڰ� ���� Ȯ�� ����. 
    }
    // ---------------------------------------------------------     
 // ��й�ȣ ��ȣȭ
 // ---------------------------------------------------------     
     System.out.println("��й�ȣ ��ȣȭ ��: "+memberVO.getM_id());
     
     AES256Util aes256 = new AES256Util();
     String encrypt_pwd = aes256.aesEncode(memberVO.getM_id());
     memberVO.setM_id(new String(encrypt_pwd));
     System.out.println("��й�ȣ ��ȣȭ ��"+memberVO.getM_id());
 // ---------------------------------------------------------     
     if (memberDAO.create(memberVO) == 1) {
       msgs.add("ȸ�������� ó�� �Ǿ����ϴ�.");
       msgs.add("�������ּż� �����մϴ�.");
       msgs.add("�̸��� ���� �� �α����� �����մϴ�.");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">Ȩ������</button>");
     } else {
       msgs.add("ȸ�� ���Կ� �����߽��ϴ�.");
       msgs.add("�˼������� �ٽ��ѹ� �õ����ּ���.");
       links.add("<button type='button' onclick=\"history.back()\">�ٽýõ�</button>");
       links.add("<button type='button' onclick=\"location.href='../index.jsp'\">Ȩ������</button>");
     }
  
     mav.addObject("msgs", msgs);
     mav.addObject("links", links);
  
     return mav;
   }*/
 
}
