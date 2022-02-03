package ques2.model.service;

import ques2.model.persistance.*;

public class CustomerDtoImpl implements CustomerDto{
	CustomerDao cs=new CustomerDaoImpl();
	@Override
	public void addCustomer(Customer c) {
		cs.addCustomer(c); 
	}

	@Override
	public Customer getById(int id) {
		return cs.getById(id);
	}

}
