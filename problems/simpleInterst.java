//Calculate simple interest
import java.util.Scanner;
public class simpleInterst {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principle: ");
        float principle = sc.nextFloat();
        
        System.out.print("\nEnter rate of interst: ");
        float rate_of_int = sc.nextFloat();
        
        System.out.print("\nEnter time: ");
        float time = sc.nextFloat();
        
        float sp = (principle * rate_of_int * time )/100;
        
        System.out.print("Simple interest is: " + sp);
        
    }
}