package com.jobplatform.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobplatform.project.entity.Project;
import com.jobplatform.project.service.ProjectService;


@RestController
@RequestMapping("/projectInfo")
public class ProjectController {

	@Autowired
    private ProjectService projectService;
	
	@GetMapping("getProject")
	public List<Project> getProject(@RequestParam String userId, @RequestParam(required = false) String projectKeyWord) {
		return projectService.getProject(projectKeyWord, userId);
	}
	
}
