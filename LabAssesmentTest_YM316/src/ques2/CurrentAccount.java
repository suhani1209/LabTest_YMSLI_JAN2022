package ques2;

public class CurrentAccount extends Account{
	private float minBalance;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(CurrentAccount acc) {
		super(acc);
		this.minBalance=acc.minBalance;
	}

	public CurrentAccount(Owner owner, float balance, String number,float minBal) {
		super(owner, balance, number);
		this.minBalance=minBal;
	}

	@Override
	public String toString() {
		return "CurrentAccount [minBalance=" + minBalance + ", toString()=" + super.toString() + "]";
	}

	public float getCharges() {
		return minBalance;
	}
	
	
}
