package com.jobplatform.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobplatform.job.entity.Job;
import com.jobplatform.job.service.JobService;


@RestController
@RequestMapping("/jobInfo")
public class JobController {

	@Autowired
    private JobService jobService;
	
	@GetMapping("getJobList")
	public List<Job> getJob(@RequestParam(required = false) String userKeyWord) {
		return jobService.getJob(userKeyWord);
	}
	
}
