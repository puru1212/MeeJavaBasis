import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList devList = new ArrayList();

		devList.add("I-Phone 12");
		devList.add("Lenovo Laptop");
		devList.add("Samsung Tab");
		devList.add("Airtel Dongle");

		ArrayList devLst = new ArrayList();

		devLst.add("I-Phone SE");
		devLst.add("HP Laptop");
		devLst.add("Panasonic Tab");
		devLst.add("Idea Dongle");

		ArrayList arLt = new ArrayList();
		
		arLt.add("Samsun Tab");
		arLt.add("Apple Laptop");

		
		
		
		Employee e1 = new Employee("Tom", 25, "dev", devList);
		Employee e2 = new Employee("Naveen", 30, "admin", devLst);
		Employee e3 = new Employee("Puru", 32, "testing", arLt);
		
		
		ArrayList<Employee> obj = new ArrayList<Employee> ();
		obj.add(0, e1);
		obj.add(1, e2);
		obj.add(2, e3);
		
		//System.out.println(obj.size());
		
		for (Employee e : obj) {
			String str ="Emp Info: "+ "Name: "+e.name + " " + "Age: "+e.age+ " " +"Dept: "+e.dept+ " " +"Company Alloted Devices: "+e.deviceList;
			System.out.println(str);
		}
	}

}
