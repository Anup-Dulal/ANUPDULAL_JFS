import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Collections_Example.Questions;

public class TestQuestions {
	
	
	ApplicationContext context;
	
	@Before
	public void first() {
		context = new ClassPathXmlApplicationContext("Second.xml");
	}

	@Test
	public void questiontest() {
		Questions qs = (Questions) context.getBean("question");
		String str = "01";
		assertEquals(str, qs.getQuestionId());
	}

}
