import java.util.Comparator;

public class Employee {
	private int id;
	private String name;
	private String dep;
	private int salary;
	public Employee(int id, String name, String dep, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
class IdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}
class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
		
	}
}
class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary()-e2.getSalary();
	}
}
class DepComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getDep().compareTo(e2.getDep());
	}
}