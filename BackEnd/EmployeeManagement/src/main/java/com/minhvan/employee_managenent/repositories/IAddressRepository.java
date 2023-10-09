package com.minhvan.employee_managenent.repositories;

import com.minhvan.employee_managenent.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long> {
}
