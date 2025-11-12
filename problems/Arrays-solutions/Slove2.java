//2. ১০ জন শিক্ষার্থীর নাম্বার ইনপুট নাও, এবং **সর্বোচ্চ মার্কস** বের করো। 
import java.util.Scanner;
public class Slove2 {
    public static void main(String agr[]){
        //create Scnnner object
        Scanner sc = new Scanner(System.in);
        
        //create array
        int[] marks = new int[10];
        
        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter mark of student "+ i+": ");
            marks[i] = sc.nextInt();
        }
        
        //Logic part
        int topMark = marks[0];
        for(int i=0; i < marks.length; i++){
            if(marks[i] > topMark){
                topMark = marks[i];
            }
        }
        System.out.print("Top marks is : "+ topMark);
    }
}