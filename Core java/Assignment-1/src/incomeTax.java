import java.util.Scanner;

public class incomeTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the CTC : ");
		double ctc = input.nextInt();
		double tax = 0;
		if(ctc>= 0 && ctc<=180000) {
			System.out.println("0% tax");
			System.out.println("NIL");
		}
		else if(ctc>=181001 && ctc<=300000) {
			System.out.println("10% Tax");
			tax = (ctc*10)/100;
			System.out.println(tax);
		}
		else if(ctc>=300001 && ctc <= 500000) {
			System.out.println("20% Tax");
			tax = (ctc*20)/100;
			System.out.println(tax);
		}
		else if(ctc>= 500001 && ctc<= 1000000) {
			System.out.println("30% Tax");
			tax = (ctc*30)/100;
			System.out.println(tax);
		}
		
	}

}
