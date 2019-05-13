package com.demoapp.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demoapp.ppmtool.domain.Project;

public interface ProjectRepository extends CrudRepository<Project,Long>{

	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
}
