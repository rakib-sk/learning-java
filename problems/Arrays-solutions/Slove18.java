//18. ১০টি নাম্বার ইনপুট নাও এবং **Array থেকে Duplicate Elements** খুঁজে বের করো।  
import java.util.Scanner;
public class Slove18 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int len = num.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter numbar "+(i+1)+": ");
            num[i] = sc.nextInt();
        }
        
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(num[i] > num[j]){
                    int temp = num[i]; 
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        for(int i=1; i<len; i++){
            if(num[i] == num[i-1]){
                System.out.print("\nDuplicate elemant is: ");
                System.out.println(num[i]);
            }
        }
        
    }
}