
import java.util.ArrayList;
import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String s = input.nextLine();
                int [] nums = convert(s, " ");
                workOrder [] orders = new workOrder[nums[0]];
                workTask [] tasks = new workTask[nums[1]];
                Part [] parts = new Part[nums[2]];

                for(int i = 0; i<nums[0];i++){
                    String order = input.nextLine();
                    String [] splitted = order.split(",");
                    orders[i] = new workOrder(Integer.parseInt(splitted[0]),splitted[1],splitted[2]);
                }
                for(int i = 0; i<nums[1];i++){
                    String order = input.nextLine();
                    String [] splitted = order.split(",");
                    tasks[i] = new workTask(Integer.parseInt(splitted[0]),Integer.parseInt(splitted[1]),Integer.parseInt(splitted[2]),splitted[3]);
                }
                for(int i = 0; i<nums[2];i++){
                    String order = input.nextLine();
                    String [] splitted = order.split(",");
                    parts[i] = new Part(Integer.parseInt(splitted[0]),splitted[1],splitted[2]);
                }
                for(workTask task: tasks){
                    int workId = task.getWorkId();
                    int partID = task.getPartId();
                    boolean foundWork= false;
                    boolean foundPart = false;
                    for(workOrder order: orders){
                        if(workId==order.getId()){
                            foundWork = true;
                        }
                    }
                    for(Part prt: parts){
                        if(partID==prt.getId()){
                            foundPart = true;
                        }
                    }
                    if(!foundWork||!foundPart){
                        System.out.print(task.getId()+ " ");
                        if(!foundWork){
                            System.out.print("MISSING WORK_ORDER " + task.getWorkId() + " ");
                        }
                        if(!foundPart){
                            System.out.print("MISSING PART " + task.getPartId());
                        }
                        System.out.println("");
                    }


                }


            }
        }
    }
    public static int[] convert(String s, String arg){
        String [] strings = s.split(arg);
        int [] arr = new int[strings.length];
        for(int i = 0; i<strings.length;i++) {
            arr[i] = Integer.parseInt(strings[i]);

        }
        return arr;
    }
}

class workOrder{
    int id;
    String title;
    String date;
    ArrayList<workTask> tasks = new ArrayList<workTask>();
    public workOrder(int i, String t, String d){
        id = i;
        title = t;
        date = d;
    }
    public int getId(){
        return id;
    }
    public void addTask(workTask w){
        tasks.add(w);
    }
}

class workTask{
    int id;
    int workOrdID;
    int partId;
    String assignedTo;
    public workTask(int w, int i, int p, String a){
        id = i;
        workOrdID = w;
        partId = p;
        assignedTo = a;
    }
    public int getPartId(){
        return partId;
    }
    public int getId(){
        return id;
    }
    public int getWorkId(){
        return workOrdID;
    }
    public String getAssignedTo(){
        return assignedTo;
    }
}

class Part{
    int id;
    String name;
    String serialNum;
    public Part(int i, String n, String s){
        id = i;
        name = n;
        serialNum = s;
    }
    public int getId(){
        return id;
    }
}

