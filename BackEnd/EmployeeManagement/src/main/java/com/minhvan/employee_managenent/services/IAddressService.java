package com.minhvan.employee_managenent.services;

import com.minhvan.employee_managenent.dtos.AddressDto;
import com.minhvan.employee_managenent.entities.Address;

public interface IAddressService {
  AddressDto create(Address entity);
}
