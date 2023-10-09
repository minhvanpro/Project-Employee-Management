package com.minhvan.employee_managenent.services;

import com.minhvan.employee_managenent.common.model.request.PagingRequest;
import com.minhvan.employee_managenent.dtos.DepartmentDto;
import com.minhvan.employee_managenent.entities.Department;
import com.minhvan.employee_managenent.filters.department.DepartmentFilter;

import java.util.List;

public interface IDepartmentService {
  DepartmentDto create(Department entity);

  List<DepartmentDto> getAll();

  List<DepartmentDto> getAll(DepartmentFilter filter);

  List<DepartmentDto> getAll(PagingRequest pagingRequest, DepartmentFilter filter);

  DepartmentDto getById(Long id);

  Boolean removeById(Long id);

  DepartmentDto update(Department entity);

  Long count(DepartmentFilter filter);
}
