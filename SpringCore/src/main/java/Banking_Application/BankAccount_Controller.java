package Banking_Application;

import org.springframework.stereotype.Controller;

@Controller
public class BankAccount_Controller implements BankAccountService {

	private BankAccount accountid;
	private BankAccount accountHolderName;
	private BankAccount accountType;
	private BankAccount accountBalance;
	
	



	public BankAccount getAccountid() {
		return accountid;
	}

	public void setAccountid(BankAccount accountid) {
		this.accountid = accountid;
	}

	public BankAccount getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(BankAccount accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public BankAccount getAccountType() {
		return accountType;
	}

	public void setAccountType(BankAccount accountType) {
		this.accountType = accountType;
	}

	public BankAccount getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BankAccount accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getDraw() {
		return draw;
	}

	

	public double withdraw(long accountid, double balance) {
		
		return 0;
	}

	public double deposit(long accountid, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBalance(long accountid) {
		return getBalance(accountid);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount_Controller ["
				+ ", accountid=" + accountid + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + "]";
	}
	
	

}
