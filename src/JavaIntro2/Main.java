package JavaIntro2;

import java.util.Scanner;

abstract class Bank {
	abstract void getDetails();

	abstract void printDetails();
}

class SBI extends Bank {

	String Bank_name;
	float rate_of_interest;

	void getDetails() {

		Bank_name = "SBI Bank";
		rate_of_interest = 10.2f;

	}

	void printDetails() {
		System.out.println("Bank name :" + Bank_name);
		System.out.println("Rate of Interest :" + rate_of_interest);
	}
	
	
	
	
}

class BOI extends Bank {

	String Bank_name;
	float rate_of_interest;

	void getDetails() {
		Bank_name = "BOI Bank";
		rate_of_interest = 10.0f;

	}

	void printDetails() {
		System.out.println("Bank name :" + Bank_name);
		System.out.println("Rate of Interest :" + rate_of_interest);
	}

}

class ICICI extends Bank {
	String Bank_name;
	float rate_of_interest;

	void getDetails() {
		Bank_name = "ICICI Bank";
		rate_of_interest = 10.0f;

	}

	void printDetails() {
		System.out.println("Bank name :" + Bank_name);
		System.out.println("Rate of Interest :" + rate_of_interest);
	}
}


  enum Account
  {
	  Saving,
	  Current
	  
	  
  }

public class Main {
	public static void main(String[] args) {

		Bank b_boi = new BOI();
	    Bank b_sbi = new SBI();
		Bank b_icici = new ICICI();
		
		Account ob=Account.Current;
		
	
		
	     Scanner sc=new Scanner(System.in);
	   
	   
		  System.out.println("Here Three Banks You can check the details when you will enter the nam of bank");
			
		  System.out.println("\n 1. SBI\n 2. BOI\n 3.ICICI");
		  
		  System.out.println("Please Enter Your Choice");
		  
		  
		  
		  String bName=sc.next();
		  
		 if(bName.equalsIgnoreCase("SBI"))
		 {
			
				b_sbi.getDetails();
				b_sbi.printDetails();
				
				System.out.println(ob);
				System.out.println(Account.Saving);
				
				System.out.println("Please Inter Your amount : ");
				
				int amount=sc.nextInt();
				
				if(amount>1200)
				{
					System.out.println("You are in Safe mode * Your welcome here*");
				}
				
				else
				{
			    try{
			        processMessage();
			    }catch(Exception E){
			        E.printStackTrace();
			    }
			 
				}
		 }
		 
		 else if(bName.equalsIgnoreCase("BOI"))
		 {
			 
			 System.out.println("Hello BOI");
			 System.out.println("----------------------------------------");

				
				b_boi.getDetails();
				b_boi.printDetails();
				
				
				System.out.println(ob);
				System.out.println(Account.Saving);
				
				


				System.out.println("Please Inter Your amount : ");
				
				int amount=sc.nextInt();
				
				if(amount>1200)
				{
					System.out.println("You are in Safe mode * Your welcome here*");
				}
				
				else
				{
			    try{
			        processMessage();
			    }catch(Exception E){
			        E.printStackTrace();
			    }
			 
				}
			 
		 }
		 
		 else if(bName.equalsIgnoreCase("ICICI"))
		 {
			 System.out.println("Hello ICICI");
			 
			 System.out.println("----------------------------------------");

				
				b_icici.getDetails();
				b_icici.printDetails();
				
			
				System.out.println(ob);
				System.out.println(Account.Saving);


				System.out.println("Please Inter Your amount : ");
				
				int amount=sc.nextInt();
				
				if(amount>1200)
				{
					System.out.println("You are in Safe mode * Your welcome here*");
				}
				
				else
				{
			    try{
			        processMessage();
			    }catch(Exception E){
			        E.printStackTrace();
			    }
			 
				}
		 }
		 
		 else {
			 System.out.println("Sorry , You have entered wrong name, please go to on rigth place");
		 }
			
		

		
		

		}
		
	
	
	
	private static void processMessage() throws Exception{
	    String transNbr = "";
	    try{
	        transNbr = "InsufficientAmountException ";
	        throw new Exception();
	    }catch(Exception E){
	        if(!transNbr.equals("")){
	            //stack trace originates from here, not from actual exception
	            throw new Exception("transction: " + transNbr); 
	        }else{
	            //stack trace gets passed correctly but no custom message available
	            throw E;
	        }
	    }
	}
	
	
	
	
	
}