import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int[] num = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i = 0; i< num.length-1; i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					//swap
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
