package collections;

import java.util.LinkedHashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		
		LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		
		h.put(10, 100);
		h.put(20, 200);
		h.put(10, 300);
		h.put(30, 200);
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
