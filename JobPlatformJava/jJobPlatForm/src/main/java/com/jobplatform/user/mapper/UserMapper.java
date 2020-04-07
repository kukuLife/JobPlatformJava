package com.jobplatform.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jobplatform.user.entity.User;

@Mapper
@Repository
public interface UserMapper {

	User select(String userId);
	
	void insert(@Param("userId")String userId, @Param("passWord")String passWord);

}
