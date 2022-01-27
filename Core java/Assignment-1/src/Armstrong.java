import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number: ");
		n = input.nextInt();
		int x=n;
		int s;
		int sum = 0;
		for(int i=1;i<= n;i++) {
			s = x % 10;
			sum = sum + (s*s*s);
			x = x /10;
		}
		if(sum == n)
			System.out.println("The number is armstrong: " + sum);
		else
			System.out.println("The number is not armstrong: "+ sum);
		
	}

}
