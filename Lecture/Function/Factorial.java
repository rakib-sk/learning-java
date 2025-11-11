import java.util.Scanner;

public class Factorial {
    public static void printFact(int n){
        if(n < 0){
            System.out.print("invaid numbar!");
            return;
        }
        int fact = n;
        for(int i = n; i >= n; i--){
            fact = fact * i;
            
        }
        System.out.print("Factoral: " + fact);
        return;
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbar: ");
        int num = sc.nextInt();
        printFact(num);
    }
}