package practice;

import java.util.Scanner;

public class cala {
	
	public static void main(String[] args) {
		
	
	
	
	float a,b,result;
	char choice;
	Scanner scan = new Scanner(System.in);

	
	do
	  {
		System.out.println("1.Addition\n");
		System.out.println("2.Subtraction\n");
		System.out.println("3.Division\n");
		System.out.println("4.Multiplication\n");
		System.out.println("5.exit\n\n");
		System.out.println("enter your choice");
		choice=scan.next().charAt(0);
		
		switch(choice)
		{
			case '1': System.out.println("enter the two numbers");
			        a=scan.nextFloat();
			        b=scan.nextFloat();
			        result= a+b;
			        System.out.println("Results ="+ result);
			        break;
			        
			
			case '2': System.out.println("enter the two numbers");
	        a=scan.nextFloat();
	        b=scan.nextFloat();
	        result= a-b;
	        System.out.println("Results ="+ result);
	                     break;
		
			case '3': System.out.println("enter the two numbers");
	        a=scan.nextFloat();
	        b=scan.nextFloat();
	        result= a/b;
	        System.out.println("Results ="+ result);
	        break;
	        
	        
			case '4': System.out.println("enter the two numbers");
	        a=scan.nextFloat();
	        b=scan.nextFloat();
	        result= a*b;
	        System.out.println("Results ="+ result);
	        break;
	        
			case'5': System.exit(0);
			
			break;
			
			default: System.out.println("entered wrong choice");
		}
		
		System.out.println("\n..............\n");
	  }
			

		
	
	
	while(choice!=5); {
		
	}
		
	

}}
