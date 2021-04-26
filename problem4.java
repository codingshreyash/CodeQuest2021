import java.util.Scanner;

public class problem4 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
		      int testCases = Integer.parseInt(input.nextLine());
		      for (int testcase = 0; testcase < testCases; testcase++) {
		       
		        String line =  input.nextLine();
		        String[] word = line.split(" ");
		        String word1 = word[0].substring(0,3);
		        String word2 = word[0].substring(3,6);
		        String word3 = word[0].substring(6,10);
		        
		        
		        String format = word[1];
		        
		 
		        
		        if (format.equals("PARENTHESES")) {
		        	System.out.println("(" +word1 + ") " +word2 + "-" + word3);
		        }
		        
		        else if (format.equals("DASHES")) {
		        	System.out.println(word1 + "-" +word2 + "-" + word3);
		        }
 
		        else  if (format.equals("PERIODS")) {
		        	System.out.println(word1 + "." +word2 + "." + word3);
		        }
		      }
		    }
		  }
		}
