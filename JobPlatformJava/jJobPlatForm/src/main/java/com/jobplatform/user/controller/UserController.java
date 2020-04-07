package com.jobplatform.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.service.UserService;

@RestController
@RequestMapping("/userInfo")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("getUser/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}
	
}
