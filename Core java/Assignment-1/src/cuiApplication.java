import java.util.Scanner;

public class cuiApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the user name: ");
		String name = input.next();
		System.out.println("Enter the password: ");
		String password  = input.next();
	
		int count = 0;
		for(int i = 1; i<=3;i++) {
			System.out.println("Provide login credentials:");
			String userName = input.next();
			String pass = input.next();
			if(name.matches(userName) && pass.matches(password)) {
				System.out.println("Welcome");
				break;
			}
			else if(count >= 3) {
				System.out.println("Too many attampts !!Contact Admin");
				break;
			}
			else {
				System.out.println("Try again");
				count= count +1;
				i = i-1;
			}
		}
	}

}
