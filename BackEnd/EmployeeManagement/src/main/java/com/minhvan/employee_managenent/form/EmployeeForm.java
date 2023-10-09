package com.minhvan.employee_managenent.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeForm {

  private Long id;

  private String fullName;

  private AddressForm idAddress;

  private Long idDepartment;
}
