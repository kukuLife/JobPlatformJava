package com.jobplatform.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jobplatform.task.entity.Task;
import com.jobplatform.task.service.TaskService;


@RestController
@RequestMapping("/taskInfo")
public class TaskController {

@Autowired
private TaskService taskService;

@GetMapping("getTaskInfoList")
public List<Task> getTask(@RequestParam String userId, @RequestParam(required = false) String taskKeyWord) {
	System.out.println(taskService.getTask(userId, taskKeyWord));
	return taskService.getTask(userId, taskKeyWord);
}
	
}
