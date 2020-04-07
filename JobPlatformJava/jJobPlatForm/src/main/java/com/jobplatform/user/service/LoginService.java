package com.jobplatform.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.mapper.UserMapper;

@Service
public class LoginService {
	
	@Autowired
    UserMapper userMapper;
	
	public boolean processLogin(String userId, String password) {
		User user = userMapper.select(userId);
		if (user.getUI_PWD().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
}
