package ques2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;
	
	public Account() {}

	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	
	public Account(Account acc)
	{
		this.balance=acc.balance;
		this.number=acc.number;
		Date dob=new Date(acc.owner.getDateOfBirth().getDate(),
				acc.owner.getDateOfBirth().getMonth(),
				acc.owner.getDateOfBirth().getYear());
		this.owner=new Owner(acc.owner.getName(),
				acc.owner.getNic(),
				dob);
		
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
	
	public float getBalance() {
		return balance;
	}
	public void print() {
		toString();
	}
	
	
	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void deposit(float amount) {
		this.setBalance(this.getBalance()+balance);
	}
	
	public void withdraw(float amount) {
		
		if(this.getBalance()>balance) {
			this.setBalance(this.getBalance()-balance);
		}
		
	}
	
}
