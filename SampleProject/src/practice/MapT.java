package practice;

import java.util.Set;
import java.util.TreeMap;

public class MapT {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		
		h.put(101, 100);
		h.put(2, 200);
		h.put(36, 300);
		h.put(400, 400);
		h.put(256, 2000);
		
		System.out.println(h);
		
		Set<Integer> keys= h.keySet();
		for(Integer key: keys)
		{
			System.out.println(key+"............."+h.get(key));
		}

	}

}
