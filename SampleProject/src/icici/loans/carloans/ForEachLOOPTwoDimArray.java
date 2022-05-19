package icici.loans.carloans;

public class ForEachLOOPTwoDimArray {

	public static void main(String[] args) {
		
		
		int[][] a = {
			     
			       {10,20,30},
			       {40,50},
			       {70,80,90,60,100}
			       
	               };
		
		for(int p[]: a)
		{
			for(int q:p) 
			 
			{
				System.out.print(q+"  ");
				
			}
			System.out.println();
		}
		
}
}