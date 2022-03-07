package Banking_Application;

public interface BankAccountService {
	public double withdraw(long accountid,double balance);
	public double deposit(long accountid, double balance);
	public double getBalance(long accountid);
	public boolean fundTransfer(long fromAccount, long toAccount, double amount);
	

}
