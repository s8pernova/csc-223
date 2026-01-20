import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 * Take 8 inputs from the user, store them in an array, compute sum, and print.
 */
public class TakeInput {
    private static final int SIZE = 8;
    static String[] list = new String[SIZE];
    
    public static void main(String[] args) {
        int sumVal = 0;
        
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            list[i] = scanner.nextLine();
            sumVal += Integer.parseInt(list[i]);
        }
        // Display output
        System.out.println("Sum: " + sumVal);
    }
}