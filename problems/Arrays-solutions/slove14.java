//14. ১০টি পণ্যের দাম ইনপুট নাও, এবং যেসব দাম **২০০ এর নিচে** তা বের করো।  
import java.util.Scanner;
public class slove14 {
    public static void main(String srg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] product = new int[10];
        int len = product.length;
        
        for(int i=0; i<len; i++){
            System.out.print("Enter "+(i+1)+" numbar product price: ");
            product[i] = sc.nextInt();
        }
        
        for(int i=0; i<len; i++){
            if(product[i] > 200){
                System.out.print("\nout of 200 TK product price is "+(i+1));
            }
        }
    }
}