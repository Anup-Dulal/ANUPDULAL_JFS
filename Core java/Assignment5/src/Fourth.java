import java.util.Date;

public class Fourth {
	public static void main(String[] args) {
		Date date = new Date();
		Pair<String,String> myobj = new Pair<>();
		myobj.setKey("1");
		myobj.setValue("Hello ");
		Pair<String, Date> myobj1 = new Pair<>();
		myobj1.setKey("Today is");
		myobj1.setValue(date);
		
		myobj.display();
		myobj1.display();
		
	}

}
