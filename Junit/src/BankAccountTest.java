import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BankAccountTest {
	
	BankAccount b;
	
	@BeforeEach
	void bank() {
		b = new BankAccount();
		
	}
	
	

	@Test
	void test()  {
		 assertThrows(InsufficentFundExceptions.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				b.withdraw(1000);
				
			}
		});	
	}

}
