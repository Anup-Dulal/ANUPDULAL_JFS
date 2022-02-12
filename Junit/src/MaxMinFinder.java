
import java.util.Arrays;

public class MaxMinFinder {
	public int[] findMinMax(int[] num) {
		int n = num.length-1;
		Arrays.sort(num);
		int[] num2 = {num[0],num[n]};
		return num2;
		
		
	}
	public int findMax(int[] num) {
		int max = 0;
		for(int i = 0 ; i<num.length ; i++) {
			if(num[i]>max) {
				max = num[i];

			}
		}
		return max;
		
	}
	public int findmin(int[] num) {
		int min = num[0];
		for(int i = 0; i<num.length;i++) {
			if(num[i]<min) {
				min = num[i];
			}
		}
		return min;
	}
	
	
}
