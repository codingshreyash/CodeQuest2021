

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {
                int ans = Integer.parseInt(input.nextLine());
                if(ans%2==0){
                    System.out.println("EVEN");
                }
                else{
                    System.out.println("ODD");
                }
            }
        }
    }
}
