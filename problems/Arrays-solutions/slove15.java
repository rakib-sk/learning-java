//15. ১০টি নাম্বার ইনপুট নাও এবং **Prime Numbers** বের করো।  
import java.util.Scanner; 
public class slove15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int len =num.length;
        for(int i=0; i<len; i++){
            System.out.print("Enter numbar "+(i+1)+": ");
            num[i] = sc.nextInt();
        }
        for(int i=0; i<len; i++){
            boolean isPrime = true; 
            if(num[i] <= 1){
                isPrime = false;
            } else {
                for(int j=2; j*j <= num[i]; j++){
                    if(num[i] % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(num[i] + " is prime numbars");
            }
        }
    }
}