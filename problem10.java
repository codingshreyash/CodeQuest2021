import java.util.Scanner;

public class problem10 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
		      int testCases = Integer.parseInt(input.nextLine());
		      for (int testcase = 0; testcase < testCases; testcase++) {
		       
		        String line =  input.nextLine();
		        String[] word = line.split(" ");
		        String action = word[0];
		        char doubleQuotes = '"';
		 
		        if (action.equals("formatHeight")) {
		        	int feet = Integer.parseInt(word[1]);
		        	int inches = Integer.parseInt(word[2]);
		        
		        	System.out.println(feet + "'" + inches + doubleQuotes);
		        }
		        
		        else if (action.equals("formatDate")) {
		        	String year = word[1];
		        	String month = word[2];
		        	String day = word[3];
		        	
		        	if (month.length() == 1) {
		        		month = ("0" + month);
		        	}
		        	
		        	if (day.length() == 1) {
		        		day = ("0" + day);
		        	}
		        	
		        	System.out.println(year + month + day);
		        }

		        else  if (action.equals("concatenate")) {
		        	for (int i = 1; i < word.length-1; i++) {
		        		System.out.print(word[i] + ",");
		        		
		        	}
		        	
		        	System.out.println(word[word.length-1]);
		        	
		        	
		        }
		      }
		    }
		  }
		}
