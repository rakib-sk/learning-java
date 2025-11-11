//Input from user two numbar. Give him sum of two numbars
import java.util.Scanner;
public class TwoNumSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbar: ");
        int first_numbar = sc.nextInt();
        System.out.print("\nEnter sccound numbar: ");
        int scound_numbar = sc.nextInt();
        int sum_of_two_numbar = first_numbar + scound_numbar;
        System.out.println("Sum of two numbar: " + sum_of_two_numbar);
    }
}