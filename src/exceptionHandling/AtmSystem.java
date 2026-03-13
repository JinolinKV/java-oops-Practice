package exceptionHandling;

import java.util.Scanner;

public class AtmSystem {
	public static void main(String[] args) {
		BankAccount account= new BankAccount();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter amount to deposit: ");
		double cash=sc.nextDouble();
		account.deposite(cash);
		
		try {
			System.out.println("enter amount to withdraw: ");
			double amount=sc.nextDouble();
			account.withdraw(amount);
			}
		catch(InsufficientException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
            System.out.println("Unexpected error occurred");
        }
		 finally {
	            System.out.println("Transaction completed.");
	        }
	}

}
