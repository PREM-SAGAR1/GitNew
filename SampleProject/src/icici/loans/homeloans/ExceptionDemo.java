package icici.loans.homeloans;

import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.crypto.NullCipher;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		
	int nr,dr,result;
	  Scanner sc  = new Scanner(System.in);
	
	
	while (true) 
	
	{
		System.out.println("Enter the nr value  : ");
		nr = sc.nextInt();
		System.out.println("Enter the dr value  : ");
		dr=sc.nextInt();
		
		
		try {
			result = nr / dr;
			System.out.println("result:" + " " + result);
			break;
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		} 
		finally {
			System.out.println("iam final");
		}
		{
			
		}


		
		} 
	}

	}


