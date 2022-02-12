import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class SimpleTest {
	
	@BeforeAll
	static void init() {
		System.out.println("Lets run the test");
	}
	
	
	Simple s;
	@BeforeEach
	void first() {
		s = new Simple();
	}

	@Test
	void addtest() {
		int ex = 3;
		assertEquals(ex, s.add(1, 2));
	}
	@Test
	void subtracttest() {
		int ex = 1;
		assertEquals(ex, s.subtract(2, 1));
	}
	@AfterEach
	void display() {
		System.out.println("End of one test method");
	}
	@AfterAll
	static void last() {
		System.out.println("End of test");
	}

}
