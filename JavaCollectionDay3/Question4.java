package JavaCollectionDay3;

import java.util.*;


//4) Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value


class EmployeeC
{
	private String name;
	private int age ;
	private String designation;
	
	
	public EmployeeC(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public void display()
	{
		
		System.out.println("Employee { "+" Name: "+name+", Age : "+age+", Designation :"+designation+" }");
	}
	
	
	
}












public class Question4 {
	
	public static void main(String[] args) {
		
		System.out.println(" *** Here Key And Object of Value .     *******");
		
		
		Map<Integer,EmployeeC> hashMap=new HashMap<Integer,EmployeeC>();
		
		EmployeeC emp1=new EmployeeC("Tome", 18,"JVM");
		
		EmployeeC emp2=new EmployeeC("Jone", 17,"ASM");
		
		EmployeeC emp3=new EmployeeC("Yash", 20, "QA");
		
		EmployeeC emp4=new EmployeeC("Jon", 21,"CSV");
		
		hashMap.put(emp1.getAge(), emp1);
		hashMap.put(emp2.getAge(), emp2);
		hashMap.put(emp3.getAge(), emp3);
		hashMap.put(emp4.getAge(), emp4);
		
		Set<Map.Entry<Integer, EmployeeC>> entries =  hashMap.entrySet();
		
		
		for(Map.Entry<Integer, EmployeeC> emp:entries)
		{
			System.out.println(emp.getKey());
			EmployeeC employee=emp.getValue();
			employee.display();
		}
	
	}

}


