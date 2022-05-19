package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefinedObject {

	public static void main(String[] args) 
	
	{
		
		Emp2 e1  = new Emp2(1, "e1");
		Emp2 e2 = new Emp2(2, "e2");
		Emp2 e3 = new Emp2(3, "e3");
		Emp2 e4 = new Emp2(4, "e4");
		
		//e1.Display();
		//e2.Display();
		//e3.Display();
		// e4.Display();  
		
		HashMap<Integer, Emp2> h = new HashMap<Integer, Emp2>();
		 
		h.put(e1.eno, e1);
		h.put(e2.eno, e2);
		h.put(e3.eno, e3);
		h.put(e4.eno, e4);
		
		//entryset
		Set<Entry<Integer, Emp2>> entires = h.entrySet();
        for(Entry<Integer, Emp2> e:entires) 
        {
        	System.out.println(e.getKey());
        	Emp2 ee = e.getValue();
        	ee.Display();
        	
        }
        
        System.out.println("..........");
        
        //alternative way to print using iterator
        
        Iterator<Integer> iterator = h.keySet().iterator();
        
        while(iterator.hasNext())
        {
        	 Emp2 obj = h.get(iterator.next());
        	 obj.Display();
        }
        	 
	}

}
