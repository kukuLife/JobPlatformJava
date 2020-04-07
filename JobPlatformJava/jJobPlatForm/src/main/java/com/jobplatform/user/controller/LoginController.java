package com.jobplatform.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jobplatform.user.service.LoginService;


@RestController
public class LoginController {

	@Autowired
    private LoginService loginService;
	
	@PostMapping("/login")
	public Boolean processLogin(@RequestParam String userId , @RequestParam String passWord, HttpServletRequest request) {
		
		Boolean successFlag = loginService.processLogin(userId, passWord);
		if(successFlag) {
			request.getSession().setAttribute("userId", userId);
		}
		
		return successFlag;
	}
	
}
