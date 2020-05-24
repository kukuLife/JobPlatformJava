package com.jobplatform.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.user.entity.User;
import com.jobplatform.user.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
    UserMapper userMapper;
	
	public User getUser(String userId) {
		
		return new User();
		//return userMapper.select(userId);
	}
	
	
	
	public boolean processLogin(String userId, String password) {
		User user = userMapper.select(userId);
		
		if ((user.getUserPassword()).equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public void processRegister(String userId, String password, String userKeyWord) {
		userMapper.insert(userId, password, userKeyWord);
	}

}
