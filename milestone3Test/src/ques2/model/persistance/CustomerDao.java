package ques2.model.persistance;

public interface CustomerDao {
	void addCustomer(Customer c);
	Customer getById(int id);
}