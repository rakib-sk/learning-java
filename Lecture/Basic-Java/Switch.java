import java.util.Scanner;
public class Switch {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbar: ");
        int numbar = sc.nextInt();
        switch(numbar){
            case 1: System.out.print("Hi!!");
            break;
            case 2: System.out.print("Hello!!");
            break;
            case 3: System.out.print("Bye!! ");
            break;
            default: System.out.print("Invaid numbar");
        }
    }
}