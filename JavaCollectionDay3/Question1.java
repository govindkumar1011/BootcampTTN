package JavaCollectionDay3;

import java.io.*;
import java.util.*;


//1) Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.



public class Question1 {
	
	
	
	public static void main(String[] args) {
		
		float sum=addElementsOfList();
		
		System.out.println("Sum of Five floating numbers  : "+sum);
		
	}
	
	
	
  public static float addElementsOfList()
  {
	  List<Float> list=new ArrayList<>();
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("You can enter five numbers and than it will show the sum of these numbers :");
	  
	  int tillPoint=5;
	  
	  float count=0;
	  
	  for(int i=0; i<tillPoint; i++)
	  {
		  float no=sc.nextFloat();
		
		  list.add(no);
	  }
	  
	  // now i am using iterator for adding all list numbers
	  
	  for(float val:list)
	  {
		  count=count+val;
	  }
	  
	  return count;
	  
	  
  }

}

