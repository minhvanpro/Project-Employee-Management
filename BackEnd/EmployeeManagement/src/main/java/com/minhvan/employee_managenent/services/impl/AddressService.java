package com.minhvan.employee_managenent.services.impl;

import com.minhvan.employee_managenent.converter.AddressConverter;
import com.minhvan.employee_managenent.dtos.AddressDto;
import com.minhvan.employee_managenent.entities.Address;
import com.minhvan.employee_managenent.repositories.IAddressRepository;
import com.minhvan.employee_managenent.services.IAddressService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AddressService implements IAddressService {
  @Autowired
  private IAddressRepository iAddressRepository;

  @Autowired
  private AddressConverter addressConverter;

  @Override
  public AddressDto create(Address entity) {
    entity = iAddressRepository.save(entity);
    AddressDto result = addressConverter.toDto(entity);
    return result;
  }
}
