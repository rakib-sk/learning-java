//4. ১০টি সংখ্যা ইনপুট নাও এবং এগুলোর **গড়** বের করো।

//গড় বের করার সূত্র হলো: গড় = (সবগুলো সংখ্যার যোগফল) / (সংখ্যার মোট পরিমাণ)
import java.util.Scanner;
public class slove4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int[] arrays = new int[10];
        
        for(int i=0; i <arrays.length; i++){
            System.out.print("Enter numbar "+ i+": ");
            arrays[i] = sc.nextInt();
        }
        
        int totalNumbar = arrays.length;
        int sum_of_numbar = 0;
        for(int i=0; i<arrays.length; i++){
            sum_of_numbar += arrays[i];
        }
        
        float avarage = sum_of_numbar/totalNumbar;
        System.out.print("\nAvarage is : "+ avarage);
    }
}