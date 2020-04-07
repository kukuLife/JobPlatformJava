package com.jobplatform.task.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jobplatform.task.entity.Task;

@Mapper
@Repository
public interface TaskMapper {

	List<Task> select(@Param("userId")String userId, @Param("taskKeyWord") String taskKeyWord);
	
	void updateTaskAnswer(@Param("taskId")String taskId, @Param("taskAnswer")String taskAnswer);
}
  