package gangaram;

import java.util.LinkedHashSet;
import java.util.Set;

public class Reversestring2 {
	
	public static void main (String args []) 
	{
		StringBuffer sb = new StringBuffer ("ramramgangaram") ;
		   System.out.println(sb.reverse());
		  
		   String n = "ramramram" ;
		   
		Set<Character> set = new LinkedHashSet<Character> ();
		
		for (int i = 0 ; i<n.length() ; i++  ) 
		{
			set.add(n.charAt(i));
		}
		
		
		for (Character c : set) 
		{
			System.out.println(c);
		}
		
	}

}
