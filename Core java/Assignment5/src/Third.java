
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Third {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Enter the size of an array: ");
		int n = input.nextInt();
		for(int i = 0; i<n;i++) {
			System.out.print("Enter the elements in array: ");
			int j = input.nextInt();
			array.add(j);
		}
		System.out.println("Before swapping");
		System.out.println(array);
		swap1(array);
		
		
	}

	public static<Integer> void swap1(ArrayList<Integer> array) {
		Collections.swap(array, 1, 2);
		System.out.println("After the swapping");
		System.out.println(array);
				
		
	}

}
