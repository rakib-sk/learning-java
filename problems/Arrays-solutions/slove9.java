//9. ৭ দিনের মধ্যে দোকানের বিক্রয় সংখ্যা ইনপুট নাও, এবং **সর্বাধিক বিক্রয় দিন** বের করো। 
import java.util.Scanner;
public class slove9 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] saleOfDayNum = new int[3];
        
        int len = saleOfDayNum.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter sales day "+(i+1)+": ");
            saleOfDayNum[i] = sc.nextInt();
        }
        
        int max_sale = saleOfDayNum[0];
        int max_sale_day = 1;
        
        for(int i=0; i<len; i++){
            if(saleOfDayNum[i] > max_sale){
                max_sale = saleOfDayNum[i];
                max_sale_day = i + 1;
            }
        }
        System.out.print("\nHighest sale day is "+max_sale_day + " sale this day is " + max_sale +" Tk");
    }
} 