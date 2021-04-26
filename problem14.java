import java.util.Scanner;

public class problem14 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
		      int testCases = Integer.parseInt(input.nextLine());
		      for (int testcase = 0; testcase < testCases; testcase++) {
		       
		        String line1 =  input.nextLine();
		        String line2 =  input.nextLine();
		        String line3 =  input.nextLine();
		        
		        String[] shift = line2.split(" ");
		        String[] direction = line3.split(" ");
		        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		    
		      int nn = 0; 
		        for (int i = 0; i < line1.length(); i++) {
		         	char c=line1.charAt(i);
		         	  for (int j = 0; j < shift.length; j++) {
		         		   int myShift = Integer.parseInt(shift[j]);
		         		   int myDirection = Integer.parseInt(direction[j]);
		         		   int cn = (int)c-64;
		         		   
		         		   if (myDirection == 1) {
		         			    nn = cn - myShift; 
		         			   if (nn < 0) {
		         				   nn = 26 - nn; 
		         			   }
		         		   }
		         		   else {
		         			   nn = cn += myShift; 
		         			 if (nn > 26) {
		         				   nn = 0 + nn-26; 
		         			   }
		         		   }
		         		
		         		  System.out.print(Character.toString(alphabet[nn]));
		         	  }
		         	 
		        }
		        System.out.println(""); 
		        
		 
		        
		      }
		    }
		  }
		}
