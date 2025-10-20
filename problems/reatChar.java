//Read char
import java.util.Scanner;
public class reatChar {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        char ch = sc.next().charAt(0);
        System.out.print("Read char: " + ch);
    }
}