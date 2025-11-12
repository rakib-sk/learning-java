//1. ছাত্রদের ৫টি পরীক্ষার মার্কস স্টোর করো এবং তাদের **মোট স্কোর** বের করো।
import java.util.Scanner;
public class Slove1 {
    public static void main(String arg[]){
        //create Scanner object
        Scanner sc = new Scanner(System.in);
        
        //create arrays
        int[] marks = new int[5];
        
        //Store mark in arays
        for(int i=0; i < marks.length; i++){
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        int maxValue = marks[0];
        //print array
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > maxValue){
                maxValue = marks[i];
            }
        }
        System.out.print("Max value is : " + maxValue);
    }
}