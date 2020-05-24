package com.jobplatform.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.job.entity.Job;
import com.jobplatform.job.mapper.JobMapper;



@Service
public class JobService {

	@Autowired
    JobMapper jobMapper;
	
	public List<Job> getJob(String jobKeyWord) {
		
		return jobMapper.select(jobKeyWord);
	}


}
