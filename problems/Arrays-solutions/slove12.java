//12. ১০টি নাম্বার ইনপুট নাও, এবং ব্যবহারকারী ইনপুট করা নাম্বারটি **Array-এ আছে কি না** চেক করো।  
import java.util.Scanner;
public class slove12 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        
        int len = num.length;
        for(int i=0; i<len; i++){
            System.out.print("Enter numbars: ");
            num[i] = sc.nextInt();
        }
        
        System.out.print("\nEnter what numbar you need: ");
        int user_num = sc.nextInt();
        
        for(int i=0; i<len; i++){
            if(num[i] == user_num){
                System.out.print("\nYour numbar is founded!! at index numbar " +(i+1));
            }
        }
    }
}