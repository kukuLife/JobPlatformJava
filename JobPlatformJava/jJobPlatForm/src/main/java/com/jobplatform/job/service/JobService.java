package com.jobplatform.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.project.entity.Project;
import com.jobplatform.project.mapper.ProjectMapper;

@Service
public class ProjectService {

	@Autowired
    ProjectMapper projectMapper;
	
	public List<Project> getProject(String projectKeyWord,String userId) {
		
		return projectMapper.select(projectKeyWord, userId);
	}


}
