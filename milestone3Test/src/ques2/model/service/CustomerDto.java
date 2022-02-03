package ques2.model.service;

import ques2.model.persistance.Customer;

public interface CustomerDto {
	void addCustomer(Customer c);
	Customer getById(int id);
}
