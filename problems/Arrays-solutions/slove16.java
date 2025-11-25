//16. ১০টি নাম্বার ইনপুট নাও এবং **Even Numbers** একটি নতুন Array তে রাখো।  

import java.util.Scanner;  
public class slove16 {  
    public static void main(String arg[]){  
        Scanner sc = new Scanner(System.in);  
          
        int[] num = new int[10];  
        int len = num.length;  
          
        // Input
        for(int i=0; i<len; i++){  
            System.out.print("Enter number "+(i+1)+": ");  
            num[i] = sc.nextInt();  
        }  
          
        // Count even numbers
        int evanArrSize = 0;  
        for(int i=0; i<len; i++){  
            if(num[i] % 2 == 0){  
                evanArrSize++;  
            }  
        }  
          
        // Create array
        int[] evanArray = new int[evanArrSize];  
          
        // Fill even numbers
        int index = 0;
        for(int i=0; i<len; i++){  
            if(num[i] % 2 == 0){  
                evanArray[index] = num[i];  
                index++;
            }  
        }  
          
        // Output
        System.out.println("\nTotal Even Numbers: " + evanArrSize);  
        System.out.println("===== Even Array =====");
          
        for(int i=0; i<evanArrSize; i++){  
            System.out.print(evanArray[i] + " ");  
        }
        
        sc.close();
    }  
}