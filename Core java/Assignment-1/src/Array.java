
public class Array {
	public static void main(String[] args) {
		int[] num = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int var = 19;
		for(int i = 0; i<num.length;i++) {
			if(num[i]==var) {
				System.out.println("Search is complete its position is " + i);
				break;
			}
		}
		
	}

}
