package com.minhvan.employee_managenent.repositories;

import com.minhvan.employee_managenent.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IDepartmentRepository extends JpaRepository<Department, Long>, JpaSpecificationExecutor<Department> {
}
