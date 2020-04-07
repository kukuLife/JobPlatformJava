package com.jobplatform.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.mapper.UserMapper;

@Service
public class RegisterService {
	
	@Autowired
    UserMapper userMapper;
	
	public void processRegister(String userId, String password) {
		userMapper.insert(userId, password);
	}
	
}
