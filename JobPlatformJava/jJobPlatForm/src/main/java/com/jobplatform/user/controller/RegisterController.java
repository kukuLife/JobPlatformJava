package com.jobplatform.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jobplatform.user.service.LoginService;
import com.jobplatform.user.service.RegisterService;


@RestController
public class RegisterController {

	@Autowired
    private RegisterService registerService;
	
	@PostMapping("/register")
	public void processRegister(@RequestParam String userId , @RequestParam String passWord, HttpServletRequest request) {
		
		registerService.processRegister(userId, passWord);
		
	}
	
}
