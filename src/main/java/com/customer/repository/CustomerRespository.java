package com.customer.repository;

import com.customer.model.Customer;

import java.util.List;

public interface CustomerRespository {

    List<Customer> findAll();

    Customer findOne(Long id);

    boolean isDataFromMemory();
}