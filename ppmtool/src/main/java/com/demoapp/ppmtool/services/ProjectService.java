package com.demoapp.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapp.ppmtool.domain.Project;
import com.demoapp.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepository;
	
	Project saveOrUpdate (Project project) {
		return projectRepository.save(project);
	}
	
}
