import java.util.Scanner;
public class conditionalStetment {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        //Checking adult or not adulat
        //Sysntax if(conditions){
        //    code;
        //}else{
        //    code;
        //}
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are adult!");
        }
        else{
            System.out.println("You are not adult");
        }
    }
}