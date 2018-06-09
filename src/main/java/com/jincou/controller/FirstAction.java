package com.jincou.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jincou.model.ActiveUser;


@Controller
//@RequestMapping("/")
public class FirstAction {
	//系统首页
	@RequestMapping("/first")
	public String first(Model model){
		
		//从shiro中的realm完成认证通过的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		//通过model传到页面
		model.addAttribute("activeUser", activeUser);
		
		return "/first";
	}	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(Model model){
		
		return "/welcome";
		
	}
}	
