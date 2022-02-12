import java.util.Map;
import java.util.TreeMap;

public class First {
	public static void main(String[] args) {
		TreeMap<Integer,Contact> tm = new TreeMap<Integer, Contact>();
		Contact c = new Contact("Hari","hari@abc.com");
		Contact c1 = new Contact("Ram","Ram@abc.com");
		Contact c2 = new Contact("Gita","Gita@abc.com");
		tm.put(1, c);
		tm.put(2, c1);
		tm.put(5, c2);
		Map<Integer, Contact> rm = tm.descendingMap();
		
		for(Map.Entry<Integer, Contact> entry: rm.entrySet()) {
			int key = entry.getKey();
			System.out.println(key);
		}
		for(Map.Entry<Integer, Contact> entry: tm.entrySet()) {
			Contact c3 = entry.getValue();
			System.out.println(c3.name +" "+c3.email);
		}
		for(Map.Entry<Integer, Contact> entry: rm.entrySet()) {
			int key = entry.getKey();
			Contact c3 = entry.getValue();
			System.out.println(key+" "+c3.name+" "+c3.email);
		}
	}

}
