package com.minhvan.employee_managenent.common.pageable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Sorter {
  private String by;

  private String name;
}
