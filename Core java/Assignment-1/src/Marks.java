import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int m1;
		int m2;
		int m3;
		System.out.println("Enter the marks of first subject: ");
		m1= input.nextInt();
		System.out.println("Enter the marks of second subject: ");
		m2 = input.nextInt();
		System.out.println("Enter the marks of third subject: ");
		m3 = input.nextInt();
		if(m1>60 && m2>60 && m3>60)
			System.out.println("All are passed.");
		else if((m1>60 && m2> 60) || (m2>60 && m3>60) || (m3>60 && m1>60))
			System.out.println("Promoted");
		else
			System.out.println("Fail");
		
	
	}
}
