import java.util.*;

public class Second {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> ts = new TreeSet<>();
		int n = 10;
		for(int i = 0; i < 10 ; i++) {
			int j = input.nextInt();
			ts.add(j);
		}
		System.out.println(ts);
	}

}
