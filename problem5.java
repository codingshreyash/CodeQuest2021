import java.util.Scanner;

public class problem5 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
		      int testCases = Integer.parseInt(input.nextLine());
		      for (int testcase = 0; testcase < testCases; testcase++) {
		       
		        String line =  input.nextLine();
		        String[] word = line.split(" ");
		        
		        int myInt = Integer.parseInt(word[0]);
		        boolean myBoolean = Boolean.parseBoolean(word[1]);
		        Double myDouble = Double.parseDouble(word[2]);
		        
		        System.out.println(" ");
		        
		        //for (int i = 0; i < cars.length; i++) {}
		       
		        
		        
		        
		        //
		        //board
		        //
		        for (int i = 0; i < 20 ; i++) {
		        	  for (int j = 0; j < 20 ; j++) {
				        	System.out.print(" 10 ");
				        }
		        	  System.out.println("");
		        }
		        
		      }
		    }
		  }
		}