import java.util.Scanner;
import java.util.*;

public class Third {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee e1 = new Employee(1,"Hari","Science",2000);
		Employee e2 = new Employee(2,"Abhi","Management",2200);
		Employee e3 = new Employee(5,"Kumar","Finance",22000);
		
		
		System.out.println("Enter in which order you want sorting");
		System.out.println("Enter a for id.");
		System.out.println("Enter b for name.");
		System.out.println("Enter c for Department.");
		System.out.println("Enter d for Salary.");
		String str = input.nextLine();
		String str1 = str.toUpperCase();
		switch(str1) 
		{
		case "A":
			Set<Employee> ts = new TreeSet<Employee>(new IdComparator());
			ts.add(e3);
			ts.add(e2);
			ts.add(e1);
			for(Employee e:ts){
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDep()+" "+e.getSalary());
			}
			break;
		case "B":
			Set<Employee> ts1 = new TreeSet<Employee>(new NameComparator());
			ts1.add(e3);
			ts1.add(e2);
			ts1.add(e1);
			for(Employee e:ts1){
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDep()+" "+e.getSalary());
			}
			break;
		case "C":
			Set<Employee> ts2 = new TreeSet<Employee>(new SalaryComparator());
			ts2.add(e3);
			ts2.add(e2);
			ts2.add(e1);
			for(Employee e:ts2){
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDep()+" "+e.getSalary());
			}
			break;
		case "D":
			Set<Employee> ts3 = new TreeSet<Employee>(new DepComparator());

			ts3.add(e3);
			ts3.add(e2);
			ts3.add(e1);
			for(Employee e:ts3){
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDep()+" "+e.getSalary());
			}
			break;
		}
	}

}
