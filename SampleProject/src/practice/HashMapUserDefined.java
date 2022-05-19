package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefined {

	public static void main(String[] args) {
		
		Emp21 e1 = new Emp21(1,"e1");
		Emp21 e2 = new Emp21(2,"e2");
		Emp21 e3 = new Emp21(3,"e3");
		Emp21 e4 = new Emp21(4,"e4");
		Emp21 e5 = new Emp21(5,"e5");
		
		
		//e1.Display();
		//e2.Display();
		//e3.Display();
		//e4.Display();
		//e5.Display();
		
		
		HashMap<Integer, Emp21> h = new HashMap<Integer, Emp21>();
		
		    h.put(e1.eno, e1);
		    h.put(e2.eno, e2);
		    h.put(e3.eno, e3);
		    h.put(e4.eno, e4);
		    h.put(e5.eno, e5);
		    
		    
		    
		    Set<Entry<Integer,Emp21>> entries = h.entrySet();
		    for(Entry<Integer, Emp21> e :entries)
		    {
		    	System.out.println(e.getKey());
		    	Emp21 ee = e.getValue();
		    	ee.Display();
		    }
		               System.out.println("................");
		               
		               //
		    
		               
		               Iterator<Integer> iterator = h.keySet().iterator();
		               
		               while(iterator.hasNext())
		               {
		            	   Emp21 obj = h.get(iterator.next());
		            	   obj.Display();
		               }
		            		   

	}

}
