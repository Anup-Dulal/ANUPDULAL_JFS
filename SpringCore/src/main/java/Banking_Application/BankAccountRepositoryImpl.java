package Banking_Application;

import java.util.Scanner;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	
	private double newBalance;
	

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	public double getBalance(long accountid) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the balance: ");
		long n = input.nextLong();
		return n;
	}

	public double updateBalance(long accountid, double newBalance) {
		// TODO Auto-generated method stub
		double x = getBalance(accountid)+getNewBalance();
		
		return x;
	}

}
