
public class Singleton {
	public static void main(String[] args) {
		Sing s1 = Sing.getSing();
		
	}

}
class Sing{
	// creation of private static variable s
	private static Sing s = new Sing();
	
	// private constructor 
	private Sing() {
	}
	// public factory method
	public static Sing getSing() {
		return s;
	}
}