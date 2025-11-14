//8. ৫টি ছেলের ওজন ইনপুট নাও, এবং **সর্বোচ্চ ওজনের ছেলে** কে তা বের করো।  

import java.util.Scanner;

public class Slove8 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] weight = new int[10];
        
        int len = weight.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter weight of student " +(i+1) +": ");
            weight[i] = sc.nextInt();
        }
        
        
        // weight = [30,40,36,55]
        //                    ^
        int max_weight = weight[0];
        int max_weight_boy = 1;
        for(int i=0; i<len; i++){
            if(weight[i] > max_weight){
                max_weight = weight[i];
                max_weight_boy = i + 1;
            }
        }
        System.out.print("\n"+max_weight+" boy is highest weight he is "+ max_weight_boy + " boy.");
    }
} 