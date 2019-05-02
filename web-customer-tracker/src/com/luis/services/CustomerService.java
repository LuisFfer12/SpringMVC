package com.luis.services;

import java.util.List;

import com.luis.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void delete(int theId);



}
