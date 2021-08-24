import java.util.ArrayList;

public class Employee {

	
	String name;
	int age;
	String dept;
	ArrayList<String> deviceList;
	
	
	public Employee(String name, int age, String dept, ArrayList<String> deviceList) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.deviceList = deviceList;
	}


	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	
	

	

}
