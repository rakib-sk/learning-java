import java.util.Scanner;
public class Input {
    public static void main(String [] args){
        // Make a scanner object
        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter a number: ");
        int num_1 = sc.nextInt();
        System.out.println("You entered: " + num_1);

        // String (single word)
        System.out.print("Enter a single word: ");
        String word = sc.next();
        System.out.println("You entered: " + word);

        // Clear the leftover newline
        sc.nextLine(); 

        // Sentence input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered: " + sentence);
    }
}