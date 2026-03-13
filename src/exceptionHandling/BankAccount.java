package exceptionHandling;

public class BankAccount {
	private double balance;
	
	public void deposite(double amount) {
		this.balance+=amount;
		System.out.println("Amount deposited successfully!..");
		System.out.println("Your current balance: "+this.balance);
	}
	
	public void withdraw(double amount)throws InsufficientException{
		if(amount<=0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		}
		if(amount>=balance) {
			throw new InsufficientException("Insufficient balance in account");
		}
		
		balance = balance- amount;
		System.out.println("Withdrawal Successfull");
		System.out.println("Balance: "+ balance);
		
	}

}
