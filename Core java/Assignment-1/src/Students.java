import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks of first student in A,B and C respectively: ");
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int a3 = input.nextInt();
		int sum1 = a1+a2+a3;
		System.out.println("Enter the marks of second student in A, B and C respectively: ");
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		int b3 = input.nextInt();
		int sum2 = b1+b2+b3;
		System.out.println("Enter the marks of third student in A,B and C respectively: ");
		int c1 = input.nextInt();
		int c2 = input.nextInt();
		int c3 = input.nextInt();
		int sum3 = c1+c2+c3;
		int total = sum1 + sum2 + sum3;
		int avg = total/9;
		System.out.println("Total sum: "+total);
		System.out.println("Average :"+avg);
		int total1 = a1+b1+c1;
		int avg1 = total1/3;
		int total2 = a2+b2+c2;
		int avg2 = total2/3;
		int total3 = a3+b3+c3;
		int avg3 = total3/3;
		System.out.println("Total and avg in A subject:"+total1 +" "+avg1);
		System.out.println("Total and avg in A subject:"+total2+" "+avg2);
		System.out.println("Total and avg in A subject:"+total3+" "+avg3);
		
		
		
	}

}
