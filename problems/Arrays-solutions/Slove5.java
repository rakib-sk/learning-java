//5. ৫টি পণ্যের দাম ইনপুট নাও, এবং **মোট ব্যয়** বের করো।  
import java.util.Scanner;
public class Slove5 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in); 
        
        int[] products_price = new int[5];
        
        for(int i=0; i<products_price.length; i++){
           System.out.print("Enter price of products " + (i+1)+": ");
            products_price[i] = sc.nextInt();
        }
        
        int total_cost = 0;
        for(int i=0; i<products_price.length; i++){
            
            total_cost += products_price[i];
        }
        System.out.print("\nTotal cost is: " +total_cost);
    }
}