package gangaram;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
   public static void main(String[] args) {
	List <String> ls = new ArrayList<String>() ;
	ls.add("REd");
	ls.add("blue");
	System.out.println(ls);
	for (String element : ls) {System.out.println(element);}
}
}
