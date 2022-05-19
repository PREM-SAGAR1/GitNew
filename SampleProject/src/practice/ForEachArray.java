package practice;

public class ForEachArray {

	public static void main(String[] args) {
		
		int[][] a = {
				    
				       {10,20,30,40},
				       {40,50,60},
				       {70,80,90,100}
				       };
		
		for(int p[]:a)
		{
			for(int q:p)
			{
			System.out.print(q+" ");
			}
		
             System.out.println();
             }
	}

}
