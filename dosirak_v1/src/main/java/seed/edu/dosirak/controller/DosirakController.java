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
 
 @RequestMapping(value="/dosirak/index.do")
	 public ModelAndView index(){

	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
	 System.out.println( org.springframework.core.SpringVersion.getVersion() +"_______스프링 버젼 확인____");
		 
	 ModelAndView mv  = new ModelAndView("index");
	
	 return mv;
	 
 }

}
