import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double p= input.nextInt();
		
		System.out.print("Enter the interest rate: ");
		double r = input.nextInt();
		
		System.out.print("Enter the time in year: ");
		double d = input.nextInt();
		System.out.println(getSimpleInterest(p , r,   d));
		System.out.println(getCompoundInterest(p , r, d));
	}

	private static double getCompoundInterest(double p, double r, double d) {
		double a;
		double n = 12;
		a = p* Math.pow(1 + ( r / n), n * d);
		return a; 
		
	}

	public static double getSimpleInterest(double p,  double r,  double d) {
		double a;
		a = p*(1+r*d);
		return a;
	}

}
