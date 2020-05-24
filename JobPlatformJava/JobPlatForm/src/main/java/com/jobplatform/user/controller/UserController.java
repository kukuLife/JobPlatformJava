package com.jobplatform.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("/userInfo/getUser/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/login")
	public Boolean processLogin(@RequestParam String userId , @RequestParam String passWord, HttpServletRequest request) {
		
		Boolean successFlag = userService.processLogin(userId, passWord);
		if(successFlag) {
			request.getSession().setAttribute("userId", userId);
		}
		
		return successFlag;
	}
	
	
	@PostMapping("/register")
	public void processRegister(@RequestParam String userId , @RequestParam String passWord,  @RequestParam String userKeyWord, HttpServletRequest request) {
		
		userService.processRegister(userId, passWord, userKeyWord);
		
	}
	
	@PostMapping("/logout")
	public Boolean processLogout(@RequestParam String userId, HttpServletRequest request) {
		
		try {
			request.getSession().removeAttribute("userId");
			return true;
		} catch(Exception e) {
			return false;
		}
		
		
	}
	
}
