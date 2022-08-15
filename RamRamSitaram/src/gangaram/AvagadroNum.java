package gangaram;

public class AvagadroNum {
    public static void main (String args []) {
    
    	for ( int  K=1 ; K<10000 ; K++) {
    	
    	int a = K ;
    	int b = a ;  int d= a ;
    	int c=0;
    	double num=0 ;
    	while (a>0)
    	{   
    		a = a/10 ;
    		c++ ;
    	}
    	//System.out.println(c);
    	while (b>0) 
    	{
    	         int r1= b%10 ;
    	         num = num + Math.pow(r1, c) ;
    	         b=b/10 ;
    	         
         	}
    	//System.out.println(num);
    	
    	if (d==num) {System.out.println("its armstrong");
    	
    	     System.out.println(num);
    	}
    	else {System.out.print("");}
    	
    	
    	
    	
    }}
}
