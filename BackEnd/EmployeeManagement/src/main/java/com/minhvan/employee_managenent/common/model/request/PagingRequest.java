package com.minhvan.employee_managenent.common.model.request;

import com.minhvan.employee_managenent.common.pageable.Sorter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PagingRequest {
  private Integer page;

  private Integer limit;

  private Sorter sorter;
}
