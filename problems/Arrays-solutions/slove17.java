//17. ১০টি নাম্বার ইনপুট নাও এবং ব্যবহারকারী ইনপুট করা নাম্বারটি **কতবার এসেছে** তা দেখাও।  
import java.util.Scanner;
public class slove17 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int len = num.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter numbar "+(i+1)+ ": ");
            num[i] = sc.nextInt();
        }
        System.out.print("\nEnter numbar: ");
        int input_num = sc.nextInt();
        
        int totalNumbarInput = 0;
        
        for(int i=0; i<len; i++){
            if(num[i] == input_num){
                totalNumbarInput++;
            }
        }
        
        System.out.print("\nYour numbar has accuring "+ totalNumbarInput +" times");
    }
}