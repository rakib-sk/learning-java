//6. ১০টি সংখ্যার মধ্যে **জোড় সংখ্যা** কতটা আছে গণনা করো।  
import java.util.Scanner;
public class Slove6 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[5];
        
        for(int i=0; i<num.length; i++){
            System.out.print("Enter numbar "+(i+1) +": ");
            num[i] = sc.nextInt();
        }
        //arr = [1,2,3,4,5]
        //               ^
        int totalEvenNum = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]%2 ==0){
                totalEvenNum = totalEvenNum + 1;
            }
        }
        System.out.print("\nTotal even numbar is : " + totalEvenNum);
    }
}