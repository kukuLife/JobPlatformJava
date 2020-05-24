package com.jobplatform.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public List<Task> getTask(@RequestParam(required = false) String userKeyWord) {
		return taskService.getTask(userKeyWord);
	}
	
	@PostMapping("processTask")
	public String processTask(@RequestParam String taskId, @RequestParam String taskAnswer) {
		
		String processResult = "";
		
		processResult = taskService.processResult(taskAnswer);
				
		taskService.updateTaskAnswer(taskId, taskAnswer);
		
		return processResult;
	}
	
}
