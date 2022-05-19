package collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("babu");
		a.add(12.88);
		a.add(256);
		a.add("a");
		a.add(30);
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.get(1));
		System.out.println(a.indexOf("babu"));
		System.out.println(a.hashCode());
		
		//for(int i=0;i<a.size();i++)
		//{
			//System.out.println(a.get(i));
		//}
		
		System.out.println(a);
		a.add(40);
		System.out.println(a);
         a.add(1, "sai");
         System.out.println(a);
         a.set(1, "jogendra");
         System.out.println(a);
         
         System.out.println(a.subList(2, 6));
         System.out.println(a.contains("lobo"));
         
         a.remove(1);
         System.out.println(a);
         
         a.remove("babu");
         System.out.println(a);
         
	}

}
