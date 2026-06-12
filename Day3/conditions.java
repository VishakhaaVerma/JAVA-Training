package Day3;

import java.util.Scanner; 
public class conditions {
	
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
	
		 //cal electricity bill
	     System.out.println("Lets calculate your Electricity bill");
	     System.out.println(" Enter units = ");
		  int units=sc.nextInt();
		  float bill =0;
		  if(units>=0 && units<=200 )
			  System.out.println("no charges");
		  else if(units>200 && units <=300)
			  bill =(units-200)*1.2f;
		  else if(units>300 && units<=400)
		  
//			  float t1 = units-200;
//			  float t2 = 100*1.2f;
			  bill=(units-300)*1.5f+(100*1.2f);
		  
		  else if (units>400 && units<=500) 
			  bill = (units -400)*2.5f+(100*1.5f)+(100*1.2f);
		  
		  else if(units>500) 
			  bill=(units-500)*8 +(100*2.5f)+(100*1.5f)+(100*1.2f);
		  
		  else 
			  System.out.println("INVALID UNITS ");
		  
		  System.out.println("your bill amount is : "+bill);
		 
		
	

		// input amount from user and print currency denominations which atm has to dispense
		        System.out.println("Welcome to ATM check currency denominations which atm has to dispense ");
				System.out.println(" Enter Amount : ");
				int amt = sc.nextInt();
			    
				int notes;
				if(amt>=2000) {
					 notes = amt/2000;
					 amt =amt%2000;
					 System.out.println("2000 x "+notes);
					 
					 if(amt>=500) {
						 notes = amt/500;
						 amt=amt%500;
						 System.out.println("500 x "+notes);
						 
						 if (amt>=200) {
							 notes = amt/200;
							 amt=amt%200;
							 System.out.println("200 x "+notes);
							 
							 if(amt>=100) {
								 notes = amt/100;
								 amt=amt%100;
								 System.out.println("100 x "+notes);
								 
								 if(amt>=50) {
									 notes = amt/50;
									 amt=amt%50;
									 System.out.println("50 x "+notes); 
									 
									 if(amt>=10) {
										 notes = amt/10;
										 amt=amt%10;
										 System.out.println("10 x "+notes);
										 System.out.println("remaining amount :"+amt);
									 }
									 
								 }
							 }
						 }
					 }
				}
				
		
		
		//check percentage and print grades
	    System.out.println("Check your grades ");
		System.out.println("Students Marks =");
		float m = sc.nextFloat(); 
		System.out.println("Total marks = ");
		float m1 = sc.nextFloat();
		if(m1>m) {
	             float perc = ((m/m1)*100);
	             System.out.println("Percentage : "+perc);
	    
	              if(perc>=90 && perc<=100) System.out.println(" grade : A ");
	              else if (perc>=80 && perc<90) System.out.println("Grade : B ");
	              else if (perc>=70 && perc<80) System.out.println("Grade : C");
	              else if (perc>=60 && perc<70) System.out.println("Grade : D");
	              else if (perc>=50 && perc<60) System.out.println("Grade : E");
	              else if (perc<50) System.out.println("Grade : F");
	              else System.out.println("Invalid Marks");
		}
	    else {
	    	System.out.println("INVALID INPUT !! total marks can not be more than marks obtained by student");
	    }
		 //check for even or odd no.
        System.out.println("Check for even or odd number");
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		//check negative or positive no.
		System.out.println("Check for positive or negative number");
		if (num>=0) System.out.println("positive number");
		else System.out.println("negative number");
		
		
		//check for alphabet or number or special char
		System.out.println("Check for alphabet or number or special char");
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		
		if ((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
			System.out.println("It is an alphabet : "+ch);
		else if(ch>=48 && ch<=57)
		     System.out.println("it is a number : "+ch);
		else
			System.out.println("it is a special character : "+ch);
		
	   sc.nextLine();
		
		//authenticate user id and password
	   System.out.println("authenticate user id and password");
		String username = "vishakhaverma";
		String password = "1234@abcd";
		
		System.out.println("USER NAME : ");
		String unm = sc.nextLine();
		 
		if(username.equals(unm))
			{
			System.out.println("PASSWORD : ");
			String pass = sc.nextLine();
			if(password.equals(pass))
				System.out.println("WELCOME "+unm);
			else
				System.out.println("INVALID PASSWORD");
			}
		else {
			System.out.println("INVALID USERNAME !! ACCESS DENIED ");
		}
		
		//check for leap year or not 
		System.out.println("Check if this year is leap ?");
		System.out.print("enter a year : ");
		int year = sc.nextInt();
		 
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
			System.out.println(year +" is a leap year");
		else 
			System.out.println(year+" is not a leap year");
		
		//compare three numbers 
		System.out.println("lets compare 3 numbers ");
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b)
			if(b>c)
				System.out.println("a is greater ");
			else
				System.out.println("c is greater");
		else
			if(b>a)
				if(b>c)
			       System.out.println("b is greater");
			    else
				   System.out.println("c is greater");
		
		
		
		
	}

}
