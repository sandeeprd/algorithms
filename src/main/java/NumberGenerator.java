import java.util.Scanner;

/**
 * Creates all numbers between two given numbers.
 */
public class NumberGenerator {

    public static void main(String[] args) {

        // Create a scanner instance for user input
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number");

        // get user input for min range
        int min = reader.nextInt();

        System.out.println("Enter a second number");

        // get user input for max range
        int max = reader.nextInt();

        System.out.println("Here is your output");

        for (int i = min; i < max + 1; i++) {
            System.out.println(i);
        }

    }
}
