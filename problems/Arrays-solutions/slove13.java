//13. ৭ দিনের তাপমাত্রা ইনপুট নাও, এবং যেসব দিন **তাপমাত্রা ৩৫° এর উপরে** তা দেখাও।  

import java.util.Scanner;
public class slove13 {
    public static void main(String srg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] temp = new int[10];
        int len = temp.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter temperarure day "+(i+1)+": ");
            temp[i] = sc.nextInt();
        }
        
        for(int i=0; i<len; i++){
            if(temp[i] > 35){
                System.out.print("\nout of 35° temperature day is "+(i+1));
            }
        }
    }
}