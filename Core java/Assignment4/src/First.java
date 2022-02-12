import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int i = input.nextInt();
		System.out.println("Enter the second number: ");
		int j = input.nextInt();
		try {
			int k = i/j;
			System.out.println("Value of k is: "+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot be divided by zero");
		}
		finally
		{
			System.out.println("End of a program.");
		}
	}

}
