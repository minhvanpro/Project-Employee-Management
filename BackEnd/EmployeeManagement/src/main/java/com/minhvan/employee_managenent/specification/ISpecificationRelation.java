package com.minhvan.employee_managenent.specification;

import org.springframework.data.jpa.domain.Specification;

public interface ISpecificationRelation<T,R> {
  Specification<T>joinEqual(String keyJoin, String key, Object value);
}
