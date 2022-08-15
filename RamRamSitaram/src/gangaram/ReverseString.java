package gangaram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;

public class ReverseString {
            public static void main (String args []) {
            	
            	StringBuffer name = new StringBuffer ("sitaram") ;
            	StringBuffer name1 = name.reverse();
            	
            	System.out.println(name1);
            	
                         
///////////////////////////////////////////////////////////////////////////////////
             
            String dupli = "coconutout" ;
            
        Set<Character> rem_dupli = new LinkedHashSet<Character> () ; 

          for (int i=0 ; i<dupli.length(); i++) {
        	  rem_dupli.add(dupli.charAt(i));        	  
          }

            StringBuffer sb =new StringBuffer () ;
            for (Character c : rem_dupli) {
            	
            	sb.append(c);
            }
          
          System.out.println(sb);
          
          
          
          
          
          
}
}