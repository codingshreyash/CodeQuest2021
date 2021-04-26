

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String s = input.nextLine();
                int launches = Integer.parseInt(s);
                boolean launchable = false;
                String s1 [] = new String[launches];
                for(int i = 0;i<launches;i++){
                    s = input.nextLine();
                    s1[i] = s;
                }
                for(int j = 0;j<s1.length;j++){
                    String [] splitted = s1[j].split(" ");
                    int thickness = Integer.parseInt(splitted[2]);
                    double speed = Double.parseDouble(splitted[3]);


                    double direction = Double.parseDouble(splitted[4]);
                    if(thickness<=1000&&(Math.abs((Math.sin(direction*Math.PI/180)*speed))<=40)&&(Math.abs((Math.cos(direction*Math.PI/180)*speed))<20)){

                        System.out.println(splitted[0] + " " + splitted[1]);
                        launchable = true;
                        break;

                    }
                }
                if(!launchable){
                    System.out.println("ABORT LAUNCH");
                }



            }
        }
    }
}
