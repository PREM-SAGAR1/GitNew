package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetD {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		s.add(10);
		s.add(40);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());

	}

}
