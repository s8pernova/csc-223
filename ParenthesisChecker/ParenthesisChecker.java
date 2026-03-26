package ParenthesisChecker;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String thisString = scnr.nextLine();

        Stack<Character> myStack = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < thisString.length(); i++) {
            char ch = thisString.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                myStack.push(ch);
            } else if (ch == ')') {
                if (myStack.isEmpty() || myStack.peek() != '(') {
                    balanced = false;
                    break;
                }
                myStack.pop();
            } else if (ch == ']') {
                if (myStack.isEmpty() || myStack.peek() != '[') {
                    balanced = false;
                    break;
                }
                myStack.pop();
            } else if (ch == '}') {
                if (myStack.isEmpty() || myStack.peek() != '{') {
                    balanced = false;
                    break;
                }
                myStack.pop();
            }
        }

        if (!myStack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }

        scnr.close();
    }
}