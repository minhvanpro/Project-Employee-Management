package com.minhvan.employee_managenent.specification.impl;

import com.minhvan.employee_managenent.specification.ISpecificationRelation;
import jakarta.persistence.criteria.Join;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class GenericSpecificationRelation<T,R> implements ISpecificationRelation {
  @Override
  public Specification joinEqual(String keyJoin, String key, Object value) {
    return (root, query, criteriaBuilder) -> {
      Join<R, T> join = root.join(keyJoin);
      return criteriaBuilder.equal(join.get(key), value);
    };
  }
}
