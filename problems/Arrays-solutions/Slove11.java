//11. ১০টি স্টুডেন্ট মার্কস ইনপুট নাও, এবং **৫০ এর উপরে মার্কস** পেলে তাদের দেখাও।
import java.util.Scanner;
public class Slove11{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] marks = new int[10];
        
        int len = marks.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter mark of student "+(i+1)+": ");
            marks[i] = sc.nextInt();
        }
        
        
        System.out.print("\n");
        int top_students = 0;
        for(int i=0; i<len; i++){
            if(marks[i] > 50){
                top_students = i + 1;
                System.out.println("To marked students is "+top_students+ " her marks is: " +marks[i]);
            }
        }
    }
}