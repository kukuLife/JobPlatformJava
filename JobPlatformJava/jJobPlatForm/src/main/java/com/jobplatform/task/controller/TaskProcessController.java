package com.jobplatform.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobplatform.task.service.TaskProcessService;

@RestController
@RequestMapping("/taskInfo")
public class TaskProcessController {

	
	@Autowired
	private TaskProcessService taskProcessService;
	
	@PostMapping("processTask")
	public String processTask(@RequestParam String taskId, @RequestParam String taskAnswer) {
		
		String processResult = "";
		
		processResult = taskProcessService.processResult(taskAnswer);
				
		taskProcessService.updateTaskAnswer(taskId, taskAnswer);
		
		return processResult;
	}
	
}
