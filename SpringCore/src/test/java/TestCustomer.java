import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.Address;
import Spring.Customer;

public class TestCustomer {
	
	
	ApplicationContext context;
	@Before
	public void first() {
		context = new ClassPathXmlApplicationContext("config.xml");
	}
	

	@Test
	public void customertest() {
		Customer cs = (Customer) context.getBean("customer");
		String str = "Mike";
		String str1 = "02";
		assertEquals(str, cs.getCustomerName());
		assertEquals(str1, cs.getCustomerid());
		
	}
	@Test
	public void addressTest() {
		Address ad = (Address) context.getBean("address");
		String str = "UK";
		assertEquals(str, ad.getCountry());
	}

}
