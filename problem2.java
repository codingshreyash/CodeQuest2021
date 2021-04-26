import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
	      int testCases = Integer.parseInt(input.nextLine());
	      for (int testcase = 0; testcase < testCases; testcase++) {
	       
	        String line =  input.nextLine();
	        String[] word = line.split(" ");
	        
	        
	        
	        
	        
	        int max_int = 0; 
	        for (int i = 0; i < word.length; i++) {
	        	int myInt = Integer.parseInt(word[i]);
	        	if (max_int < myInt) {
	        		max_int = myInt; 
	        		
	        	}
	        	
	        	
	        }
	        System.out.println(max_int);
	        
	        
	        	  
	        }
	      }
	    }
	  }
	