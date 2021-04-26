import java.util.Scanner;

public class problem6 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
		      int testCases = Integer.parseInt(input.nextLine());
		      for (int testcase = 0; testcase < testCases; testcase++) {
		       
		        String line =  input.nextLine();
		        //String[] word = line.split("");
		        
		     
		        int add = 0;
		        String alpha = "abcdefghijklmnopqrstuvwxyz";
		        for (int i = 0; i < line.length(); i++) {
		        	char c=line.charAt(i);
		        	int cn = (int)c-96;
		        	
		        	add += cn; 
		       
		        	
		        	
		        }
		        System.out.println(add);
		      }
		    }
		  }
		}
