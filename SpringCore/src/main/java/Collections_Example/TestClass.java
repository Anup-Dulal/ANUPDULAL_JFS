package Collections_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Second.xml");
		Questions qs = (Questions) context.getBean("question");
		qs.display();
	}

}
