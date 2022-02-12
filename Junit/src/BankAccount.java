

public class BankAccount {
	public int withdraw(int i)  {
		int total = 100000;
		if(total<i) { 
			try {
				throw new InsufficentFundExceptions("Amount is insufficent");
			}
			catch(InsufficentFundExceptions e) {
				System.out.println(e.getMessage());
			} 
		}
		
		return total-i;
	}
}
