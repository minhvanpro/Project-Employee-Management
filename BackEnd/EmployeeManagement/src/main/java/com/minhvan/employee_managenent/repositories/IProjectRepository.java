package com.minhvan.employee_managenent.repositories;

import com.minhvan.employee_managenent.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IProjectRepository extends JpaRepository<Project, Long>, JpaSpecificationExecutor<Project> {
}
