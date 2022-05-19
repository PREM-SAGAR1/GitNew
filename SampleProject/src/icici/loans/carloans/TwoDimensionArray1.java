package icici.loans.carloans;

public class TwoDimensionArray1 {

	public static void main(String[] args) {

		
		int[][] a = {
			     
			       {10,20,30},
			       {40,50},
			       {70,80,90,60,100}
			       
	               };
	
	for(int i=0;i<3;i++)
		
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"  ");
			
		}
		System.out.println();
			      
	}
	}

}
