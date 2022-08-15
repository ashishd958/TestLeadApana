package gangaram;

public class PrimeNumber {
           public static void main (String args []) {
        	   
        	   int a= 13 ;
        	   int temp = 0 ;
        	   for (int i = 2 ; i<a-1 ; i++) 
        	   {
        		   int r = a%i ;
        		   if (r==0)
        		   {
        			    temp++ ;
        		   }        		   
           	   }
        	   
        	   if (temp==0) {System.out.println("its prime");}
        	   else {System.out.println("its not prime");}
        	   
        	   
        	   
        	   // printting alternate prime numbers
        	   
        	   int temp1=0;
        	   int g= 100 ;
        	   int k  ; 
        	   int des =0 ;
        	   
        	    for ( k = 1 ; k<=100 ; k++) 
        	    {
        	    	if (k>1) {
        	    	
        	        for (int j=2 ; j<k-1 ; j++) 
        	        {
        	        	if (k%j==0) { temp1++ ;} 
        	        }
        	               	    
        	    
        	    	if (temp1==0) 
        	    	{
        	    		   des++ ;
        	    		   
        	    		if (des%2!=0) {   
        	           System.out.println(k);}		
        	    	}
        	    	
        	    	else {	temp1=0 ; }
        	    	}
        	    }	
        	    	
        	    	
        	    
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
           }
}
