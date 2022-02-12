import java.util.Scanner;

public class Saving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance = 5000;
		System.out.println("Enter the amount you want to withdraw: ");
		double i = input.nextDouble();
		withdraw(i,balance);
		
	}

	public static void withdraw(double i,double balance) {
		if(i >= balance || balance == 0)
			try {
				throw new InSufficentBalanceException("Your Balance is not sufficient");
			}
			catch(InSufficentBalanceException e)
			{
				System.out.println(e.getMessage());
			}
		else if(i<0) {
			try {
				throw new IllegalBankTranscationException("Please provide the positive number: ");
			}
			catch(IllegalBankTranscationException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
			System.out.println("Your remaing balance is: "+(balance-i));
		
	}

}

