import java.util.HashMap;
import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Double> hm = new HashMap<>();
		System.out.print("Enter the number you want to find hash value: ");
		int n = input.nextInt();
		for(int i = 0; i<n;i++) {
			int a = input.nextInt();
			double b = input.nextDouble();
			hm.put(a, b);
		}
		System.out.println(hm);
	}

}
