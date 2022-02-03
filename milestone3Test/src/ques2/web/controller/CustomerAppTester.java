package ques2.web.controller;

import java.sql.Date;

import ques2.model.persistance.Customer;
import ques2.model.service.CustomerDto;
import ques2.model.service.CustomerDtoImpl;


public class CustomerAppTester {

	public static void main(String[] args) {
		CustomerDto customerService=new CustomerDtoImpl(); 
		
		
		System.out.println("add new customer");
		customerService.addCustomer(new Customer(124, "abcd", "ymsli","9783478384", Date.valueOf("1990-06-25")));
		customerService.addCustomer(new Customer(125, "abcd", "ymsli","9783478384", Date.valueOf("1990-06-25")));
		
		
		Customer customer=customerService.getById(1);
		System.out.println("get by id");
		System.out.println(customer);


	}

}