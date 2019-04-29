package corejava;

public class pattern1 {

	
		
		
		
		// public static void printStars(int n) 
		  //  { 
		      //  int i, j; 
		        public static void main(String args[]) 
			    { 
		  
		        // outer loop to handle number of rows 
		        //  n in this case 
		        for(int i=0; i<5; i++) 
		        {                                                           
		        							
		  
		            //  inner loop to handle number of columns 
		            //  values changing acc. to outer loop     
		            for(int j=4; j>=i; j--) 
		            { 
		                // printing stars 
		                System.out.print(" * "); 
		            } 
		  
		            // ending line after each row 
		            System.out.println(); 
		        } 
		   } 
	}
		
		 // Driver Function 
		 /*   public static void main(String args[]) 
		    { 
		        int n = 5; 
		        printStars(n); 
		    } 
		} */

			
		




