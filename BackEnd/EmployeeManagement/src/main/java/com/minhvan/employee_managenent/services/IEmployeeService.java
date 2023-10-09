package com.minhvan.employee_managenent.services;

import com.minhvan.employee_managenent.common.model.request.PagingRequest;
import com.minhvan.employee_managenent.dtos.EmployeeDto;
import com.minhvan.employee_managenent.entities.Employee;
import com.minhvan.employee_managenent.filters.employee.EmployeeFilter;

import java.util.List;

public interface IEmployeeService {
  EmployeeDto create(Employee entity);

  Boolean removeById(Long id);

  List<EmployeeDto> getAll();


  List<EmployeeDto> getAll(PagingRequest pagingRequest,EmployeeFilter employeeFilter);
  List<EmployeeDto> getAll(EmployeeFilter employeeFilter);

  EmployeeDto getById(Long id);

  EmployeeDto update(Employee entity);

  Long count(EmployeeFilter filter);

}
