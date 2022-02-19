package JavaCollectionDay3;


// 2) Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employees implements Comparable<Employees>
{
	
	String name;
	double age;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employees(String name, double age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
    public String toString()
    {
    	return "Employee{" +
    "Name : " +name+
    ", Age : " +age+ '\''+
    ",Salary : '"+salary+ '\''+
    '}';
    }
    
    
	@Override
	public int compareTo(Employees employee) {
		
		return this.name.compareTo(employee.name);
	}
    
     
   
	
}



public class Question2Part1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("\n\n* **** Here is sorting by name of employee ******* \n\n ");
		
		
		List<Employees> emp=new ArrayList<>();
		
		emp.add(new Employees("Govind Sharma ", 22, 10000));
		emp.add(new Employees("Vishal Kumar ", 21, 3000));
		emp.add(new Employees("Sumesh kumar", 23, 12000));
		emp.add(new Employees("Govind Saini", 23, 12000));
		
		emp.add(new Employees("Abhijit tirpathi", 18,4000));
		emp.add(new Employees("Sumesh kayani", 25,   8000));
		
		Collections.sort(emp);
		
		

		for(Employees val:emp)
		{
			System.out.println(val);
		}
		
		
		
	}

	
	
	
}
