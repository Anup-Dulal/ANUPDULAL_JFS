

public class Armstrongnext {
	public static void main(String[] args) {
		for(int i=100;i<=1000;i++) {
			int x=i;
			int s =0;
			int sum = 0;
			while(x>0) {
				s = x%10;
				sum = sum + (s*s*s);
				x= x/10;
			}
			if(i == sum)
				System.out.println(sum);
		}
		
		
	}

}
