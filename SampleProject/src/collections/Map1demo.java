package collections;

import java.util.Set;
import java.util.TreeMap;

public class Map1demo {

	public static void main(String[] args) 
	
	{
	TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		
		h.put(101, 100);
		h.put(2, 200);
		h.put(10, 300);
		h.put(350, 200);
		h.put(40, 400);
		
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		Set<Integer> keys = h.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+".............."+h.get(key));
		}
		

	}

}
