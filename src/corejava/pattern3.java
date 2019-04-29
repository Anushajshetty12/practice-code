package corejava;

public class pattern3 {
	 public static void main(String args[]) 
	    { 

     // outer loop to handle number of rows 
     //  n in this case 
     for(int i=0; i<5; i++) 
     {                                                           
     							

         //  inner loop to handle number of columns 
         //  values changing acc. to outer loop     
         for(int j=0; j>=i; j++) 
         { 
             // printing stars 
             System.out.print(" * "); 
         } 

         // ending line after each row 
         System.out.println(); 
     } 
} 
}



