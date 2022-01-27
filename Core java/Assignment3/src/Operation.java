
public class Operation {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in the heap memory";
		String str1 = str.toLowerCase();
		String str2 = str.toUpperCase();
		String str3 = str.replace("a", "$");
		boolean str4 = str.contains(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		String str5 = "java string pool refers to collection of strings which are stored in heap memory";
		if(str.matches(str5))
			System.out.println("it matches");
		else
			System.out.println("Matching again "+ str.equals(str5));
		
	}

}
