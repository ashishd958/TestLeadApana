package gangaram;

public class StarPattern1 {
   public static void main(String[] args) {
	
	   for (int i = 1 ; i<5 ; i++ ) 
	   {
		   for (int k=1 ; k<=i ; k++ ) 
		   {
			   System.out.print(" *");
		   }
	   System.out.println("");
	   }
//////////////////////////////////////////////////////////////////////////
	   
	   for (int j= 1 ; j<5 ;  j++) 
	   {
		   for (int l = 4 ; l>j ; l--) 
		   {
			   System.out.print(" ");
		   }
	   for (int m = 1 ; m<=j ; m++ ) 
	      {
		   System.out.print(" *");
	      }
	   System.out.println("");
	   }
//////////////////////////////////////////////////////////////////////////	   
	           
	   for (int a=1 ; a<5 ; a++ ) 
	   {
		   for (int b=5 ; b>a ; b--) 
		   {
			   System.out.print("*");
		   }
		   System.out.println("");
	   }
	   ////////////////////////////
	   
	   // pattern - 6
	   
	   for (int c=1 ; c<6 ; c++) 
	   {
		   for (int d=1 ; d<=c ; d++) 
		   {
			   System.out.print(" ");
		   }
	            for (int e= 5 ; e>=c ; e--) 
	            {
	            	System.out.print("*");
	            }
	                           
	               for (int f = 4 ; f>=c ; f--) 
	               {
	            	   System.out.print("*");
	               }
	            	   System.out.println("");
	   } 
	   
}
}
