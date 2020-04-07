package com.jobplatform.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.task.entity.Task;
import com.jobplatform.task.mapper.TaskMapper;

@Service
public class TaskService {

	@Autowired
	public TaskMapper taskMapper;
	
	public List<Task> getTask(String userId, String taskKeyWord) {
		// TODO Auto-generated method stub
		return taskMapper.select(userId, taskKeyWord);
	}

}
