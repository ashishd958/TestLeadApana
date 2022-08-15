package gangaram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveVowelsandCount {
    public static void main(String[] args) {
		
    String name = "ashishashishashish" ;
     String vowel_s = name.replaceAll("[^aeiou]", "") ;
       System.out.println(vowel_s);
      
       int g  = vowel_s.length(); 
       
       System.out.println(vowel_s.length());
       
       Set<Character> set = new LinkedHashSet () ;
       
       for (int i = 0 ; i<g ; i++) {
    	   
    	   set.add(vowel_s.charAt(i));
       }
       
       StringBuffer sb = new StringBuffer () ;
       
       for (Character c : set) { sb.append(c); }
       System.out.println(sb);
       System.out.println(sb.length());
       
    	                                                                 
	}
}
