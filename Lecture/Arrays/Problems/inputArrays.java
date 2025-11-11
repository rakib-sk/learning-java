import java.util.Scanner;
public class inputArrays {
    public static void main(String arg[]){
        //Scanner oblect
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //empty array
        int num[] = new int[size];
        //input size
        for(int i=0; i<size; i++){
            
            num[i] = sc.nextInt();
        }
        //input element
        for(int i = 0; i < size; i++){
            System.out.println(num[i]);
        }
    }
}