

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {
                String s = input.nextLine();
                String [] strings = s.split(" ");
                int [] nums = new int[2];
                nums[0] = Integer.parseInt(strings[0]);
                nums[1] = Integer.parseInt(strings[1]);
                if((nums[0]-nums[1])==-15||(nums[0]-nums[1])==-13||(nums[0]-nums[1])==-11||(nums[0]-nums[1])==-10||(nums[0]-nums[1])==-8||(nums[0]-nums[1])==-5||(nums[0]-nums[1])==-4||(nums[0]-nums[1])==-2||
                        (nums[0]-nums[1])==1||(nums[0]-nums[1])==5||(nums[0]-nums[1])==12){
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
        }
    }
}
