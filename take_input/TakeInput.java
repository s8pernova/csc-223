import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

// take 8 inputs from the user, store them in an array, compute sum and print

public class TakeInput {
    private static final int SIZE = 8;
    static String[] list = new String[SIZE];
    
    public static void main(String[] args) {
        // take input from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            String input = scanner.nextLine();
            list[i] = input;
        }
        // display output
        list = Arrays.stream(list).toArray(String[]::new);
        System.out.println("Sum: " + Arrays.stream(list).mapToInt(Integer::parseInt).sum());
    }
}