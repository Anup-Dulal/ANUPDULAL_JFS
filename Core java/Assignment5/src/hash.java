import java.util.HashSet;

public class hash {
	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(1,"Anup",22000,"Engg");
		Employee e2 = new Employee(2,"Amit",25000,"Business");
		Employee e3 = new Employee(3,"hari",35000,"Finance");
		Employee e4 = new Employee(4,"SRK",135000,"Entertainment");
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		for(Employee e:hs) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDep());
		}
		
	}
}
