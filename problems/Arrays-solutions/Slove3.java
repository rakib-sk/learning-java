//3. ৭ দিনের তাপমাত্রা ইনপুট নাও, এবং **সর্বনিম্ন তাপমাত্রা** বের করো।  
import java.util.Scanner;
public class Slove3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int[] temperature = new int[7];
        
        for(int i=0; i<temperature.length; i++){
            System.out.print("Enter temperature of day " + (i+1) + ": ");
            temperature[i] = sc.nextInt();
        }
        
        int min_temp = temperature[0];
        
        for(int i=0; i<temperature.length; i++){
            if(temperature[i] < min_temp){
                min_temp = temperature[i] ;
            }
        }
        System.out.print("Low temperature is: " + min_temp);
    }
}
