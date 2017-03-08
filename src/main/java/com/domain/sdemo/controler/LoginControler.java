package com.domain.sdemo.controler;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.sdemo.service.UserLoginService;

@RestController
@RequestMapping("/admin")
public class LoginControler {
	
	@Resource(name="UserLoginServiceImpl")
	private UserLoginService userLoginService;
	
	@RequestMapping("/login")
	public String login(String userId,String userPassword){//userId:demo1@test.com  user_password:admin
		userId = "demo1@test.com";
		userPassword = "admin";
		boolean result = userLoginService.checkUserLogin(userId, userPassword);
		return Boolean.toString(result);
	}
}
