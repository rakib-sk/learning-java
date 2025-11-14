import java.util.Scanner;

public class slove10 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int len = num.length;

        for(int i=0; i<len; i++){
            System.out.print("Enter number "+ (i+1) +": ");
            num[i] = sc.nextInt();
        }

        // descending sort with 2 loops
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(num[i] < num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("Descending Order:");
        for(int i=0; i<len; i++){
            System.out.println(num[i]);
        }
    }
}