package JavaCollectionDay3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// sort employee data on the bases of employee salary with comparator

// Q2.Also, Write a program to sort Employee objects based on salary using Comparator. 





class Employee
{
	
private	String name;
private	double age;
private	double salary;

public Employee(String name,double age,double salary)
{
	
   this.name=name;
   this.age=age;
   this.salary=salary;
	
	
}

public void setName(String name)
{
	this.name=name;
}

public String getName()
{
	return name;
}

public void setAge(double age)
{
	this.age=age;
	
}

public double getAge()
{
	return age;
}
    
public void setSalary(double salary)
{
	
	this.salary=salary;
	
}

public double getSalary()
{
	return salary;
}
	
	
public String toString()
{
	return "Employee{" +
		    "Name : " +name+
		    ", Age : " +age+ '\''+
		    ",Salary : '"+salary+ '\''+
		    '}';
		    
}


	

}


class SortBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getSalary()==o2.getSalary())
		{
			return 0;
			
		}
		
		else if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
		
		
	}
	
}


public class Question2Part2 {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("\n *   **** Here We are Sorting by Salary with Camparator  *    ****\n");
		
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("Govind Sharma ", 22, 10000));
		list.add(new Employee("Vishal Kumar ", 21, 3000));
		list.add(new Employee("Sumesh kumar", 23, 12000));
		list.add(new Employee("Govind Saini", 23, 12000));
		
		list.add(new Employee("Abhijit tirpathi", 18,4000));
		list.add(new Employee("Sumesh kayani", 25,   8000));
		
		
		Collections.sort(list, new SortBySalary());
		
		
		for(Employee sal:list)
		{
			System.out.println(sal);
		}
		
		
		
		
			
		
		
	}
	

}
