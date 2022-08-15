package gangaram;

public class PalindromeNumber {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main (String args []) {
		
		int a = 4567654 ;
	    int b = a ;
	    int sum = 0 ;
	    while (a>0) {
	    	
	    	int r = a%10 ;
	    	sum = sum*10 + r  ;	    	
	       
	    	   a=a/10 ;
	    }
	         System.out.println(sum);
	         if (sum==b) {System.out.println("its palindrome");}
	         else  {System.out.println("its not palindrome");}
	         
	      int m= 123;
	        int r = m%10 ;
	        System.out.println(r);
	         System.out.println(123/10);
	}

}
