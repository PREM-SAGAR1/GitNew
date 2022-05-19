package icici.loans.carloans;

import java.util.Scanner;

public class StudentGradeCalculation {

	public static void main(String[] args)
	{
		int[] mark = new int[5];
		float sum=0, avg;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Marks Obtained in 5 subjects : ");
		
		for(int i=0; i<5;i++)
		
		{
			mark[i] = scan.nextInt();
			sum=sum+mark[i];
			
		}
		
		System.out.println("Sum of 5 subjects : " +sum);
		
		avg = sum/5;
		System.out.println("Average of Subject is : "+avg);
		
		System.out.print("Your Grade is : "); 
		
		if(avg>80)
		{
			System.out.println("A");
		}
		else if(avg>60 && avg<=80)
		{
			System.out.println("B");
		}
		else if(avg>40 && avg<=60)
		{
			System.out.println("C");
		}
		else
			System.out.println("D");
	}

}
