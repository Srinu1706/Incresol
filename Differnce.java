package Incresol;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Differnce {

	public static void main(String[] args) {
		String a= new String ("java");
		String b= new String ("java");
		
//		HashMap<String, Integer> h= new HashMap<>();
		
		IdentityHashMap<String, Integer> h= new IdentityHashMap<>();
		
		
		h.put(a, 1);
		h.put(b, 2);
		System.out.println(h.size());
		
		
		String f1="Bandaru";
		String f2="Bandaru";
		System.out.println(f1==f2);
		
		
			String s1 = "Java";
			String s2 = new String("Java");
			s2=s2.intern();
			System.out.println(s1==s2);
	}

}
