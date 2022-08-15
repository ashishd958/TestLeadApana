package gangaram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString1 {
            public static void main(String[] args) {
				StringBuffer sb = new StringBuffer ("shyamshyam");
				  StringBuffer sb1 = sb.reverse() ;
				  System.out.println(sb1);
	// remove duplicate 
				  
          String n = "ramram" ;
          Set<Character> set = new LinkedHashSet <Character> () ;
          
          for (int i=0 ; i<n.length(); i++) 
          {
        	  set.add(n.charAt(i));
          }
		
          StringBuffer kb = new StringBuffer () ;
          
          for (Character c: set) 
          {
        	  kb.append(c);
          }
          
		System.out.println(kb);
		
				  
				  
				  
				  
				  
            }				  
}
