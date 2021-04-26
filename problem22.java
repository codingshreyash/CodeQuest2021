import java.util.Scanner;
import java.util.Arrays;


public class problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] TI = input.nextLine().split(" ");
            int T = Integer.parseInt(TI[0]);
            int I = Integer.parseInt(TI[1]);
            boolean[][] boolArr = new boolean[T][3];
            for (int j = 0; j < T; j++) {
                String read = input.nextLine();
                String[] clause = read.split(" ");
                for (int r=0; r<clause.length; r++) {
                    if (clause[r].contains("!") ){
                        clause[r] = clause[r].substring(1) + "!";
                    }
                }
                Arrays.sort(clause);
                for (int k = 0; k < 3; k++) {
                    boolArr[j][k] = clause[k].contains("!") ? false : true;
                }
            }
            for (int x = 0; x < I; x++) {
                String[] evalCaseStr = input.nextLine().split(" ");
                boolean[] evalCase = new boolean[evalCaseStr.length];
                for (int t = 0; t < evalCaseStr.length; t++) {
                    evalCase[t] = evalCaseStr[t].contains("1") ? true : false;
                }

                boolean sat3 = true;
                for (int clauseCount = 0; clauseCount < boolArr.length; clauseCount++) {
                    boolean clauseState = false;
                    for (int clauseItem = 0; clauseItem < boolArr[0].length; clauseItem++) {
                        clauseState = clauseState || boolArr[clauseCount][clauseItem] == evalCase[clauseCount * 3 + clauseItem];
                    }
                    sat3 = sat3 && clauseState;
                }
                System.out.println(String.valueOf(sat3).toUpperCase());
            }
            if(I < 1) {
                System.out.println("TRUE");
                return;
            }
        }
        input.close();
    }
}