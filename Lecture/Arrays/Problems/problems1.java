//Take an array as input from the user. Search for a given numbar x and print this index which occur.
import java.util.Scanner;
public class problems1 {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        //input array size
        int size = sc.nextInt();
        
        int[] num = new int[size];
        //calculate array lenght
        
        //input array element
        for(int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }
        
        //print array element
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }
        //input x from user
        int x = sc.nextInt();
        //finding x
        for(int i=0; i<num.length; i++){
            if(num[i] == x){
                System.out.println("x is found at index : " + i);
            }
        }
        
    }
}