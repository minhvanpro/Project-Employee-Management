package com.minhvan.employee_managenent.services;

import com.minhvan.employee_managenent.common.model.request.PagingRequest;
import com.minhvan.employee_managenent.dtos.ProjectDto;
import com.minhvan.employee_managenent.entities.Project;
import com.minhvan.employee_managenent.filters.project.ProjectFilter;

import java.util.List;

public interface IProjectService {
  ProjectDto create(Project entity);

  Boolean removeById(Long id);

  ProjectDto update(Project entity);

  List<ProjectDto> getAll();

  List<ProjectDto> getAll(ProjectFilter projectFilter);

  List<ProjectDto> getAll(PagingRequest pagingRequest, ProjectFilter projectFilter);

  ProjectDto getById(Long id);

  Long count(ProjectFilter filter);
}
