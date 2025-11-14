//7. ১০টি সংখ্যার মধ্যে **বিজোড় সংখ্যা** কতটা আছে গণনা করো। 
import java.util.Scanner;
public class Slove7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        
        int len = num.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter numbar " +(i+1)+ ": ");
            num[i] = sc.nextInt();
        }
        
        int total_odd = 0;
        
        for(int i=0; i<len; i++){
            
            if(num[i]%2 !=0){
                total_odd = total_odd + 1;
            }
        }
        System.out.print("\nTotal odd numbar is: "+total_odd);
    }
}