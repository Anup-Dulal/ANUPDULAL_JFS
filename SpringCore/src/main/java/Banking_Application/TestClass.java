package Banking_Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Third.xml");
		BankAccount_Controller bank = (BankAccount_Controller) context.getBean("bankAccount");
		System.out.println(bank.toString());
	}

}
