package icici.loans.carloans;

import java.util.Scanner;

public class CalculationsSwitch {

	public static void main(String[] args) {

		float a,b,res;
		char choice;
		Scanner scan = new Scanner(System.in);
		
		do 
		  {
			
			System.out.println("1. Addition\n");
			System.out.println("2. Subtraction\n");
			System.out.println("3. Multiplication\n");
			System.out.println("4. Division\n");
			System.out.println("5. Exit\n\n");
			System.out.println(" Enter your choice :");
			choice = scan.next().charAt(0);
			
			switch(choice)
			{
			case '1' : System.out.print("Enter two numbers: ");
			        a = scan.nextFloat();
			        b = scan.nextFloat();
			        		res = a+b;
			        System.out.println("Results = "+ res);
			        break;
			        
			case '2' : System.out.print("Enter two numbers: ");
	        a = scan.nextFloat();
	        b = scan.nextFloat();
	        		res = a - b;
	        System.out.println("Results = "+ res);
	                   break;
	        
	        
			case '3' : System.out.print("Enter two numbers: ");
	        a = scan.nextFloat();
	        b = scan.nextFloat();
	        		res = a * b;
	        System.out.println("Results = "+ res);
	                  break;
	        
			case '4' : System.out.print("Enter two numbers: ");
	        a = scan.nextFloat();
	        b = scan.nextFloat();
	        		res = a / b;
	        System.out.println("Results = "+ res);
	                 break;
	        
			case '5' : System.exit(0);
			         break;
			         
			default:System.out.print("Wrong choice!!!");
			         break;
			}
			
			System.out.print("\n........................\n");
			         }
		
		while(choice!=5);
		}
		
		
	}


