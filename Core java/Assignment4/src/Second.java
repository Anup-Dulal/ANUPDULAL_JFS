import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int i = input.nextInt();
		System.out.println("Enter the second number: ");
		int j = input.nextInt();
		try {
			if(i<0 || j<0) {
				throw new UnsupportedOperationException();
			}
			else {
				int k = i/j;
				System.out.println("Value of k is: "+k);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot be divided by zero.");
		}
		catch(UnsupportedOperationException e) {
			System.out.println("Number provided should be greater then zero.");
		}
	}
}