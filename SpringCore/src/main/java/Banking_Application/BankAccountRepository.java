package Banking_Application;

public interface BankAccountRepository {
	
	public double getBalance(long accountid);
	public double updateBalance(long accountid, double newBalance);

}
