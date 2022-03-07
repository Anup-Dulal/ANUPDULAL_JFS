package Spring;

public class Customer {
	private String customerid;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void display() {
		System.out.println("Customer id: "+getCustomerid());
		System.out.println("Customer name: "+getCustomerName());
		System.out.println("Customer contact: "+getCustomerContact());
		System.out.println("Customer address: "+getCustomerAddress().getStreet()+" "+getCustomerAddress().getCity()+" "+
		getCustomerAddress().getState()+" "+getCustomerAddress().getZip()+" "+getCustomerAddress().getCountry());
	}

}
