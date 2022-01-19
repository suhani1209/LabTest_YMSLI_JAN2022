package ques2;

public class Main {
	public static void main(String[] args) {
		Date date=new Date(12,9,2022);
		Owner owner=new Owner("Suhani","pcb2022",date);
		Account account=new Account(owner,1500.0f,"13764");
		
		System.out.println("initial balance of account is : ");
		account.deposit(1500);
		System.out.println("final balance of account is : ");
		System.out.println(account);
		account.withdraw(1300);
		
		Account savAcc=new SavingAccount(owner, 1870.0f, "3576", 19);
		savAcc.print();
		System.out.println("Initial balance of saving account is : "+savAcc.getBalance());
		savAcc.deposit(839.0f);
		System.out.println("Now the balance of saving account becomes : "+savAcc.getBalance());
		
		
		Account currAcc=new CurrentAccount(owner, 4500.0f, "3576", 19);
		System.out.println("Current balance of current account is : "+currAcc.getBalance());
		
		
	}
}
