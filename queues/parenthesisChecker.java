package queues;

import java.util.Scanner;
import java.util.Stack;

public class parenthesisChecker {
    Scanner scnr = new Scanner(System.in);

    String thisString = scnr.nextLine();

    Stack<Character> myStack = new Stack<>();

    for(
    int i = 0;i<thisString.length();i++)
    {
        if (thisString.charAt(i) == '(') {
            myStack.push('(');
        } else if (thisString.charAt(i) == '[') {
            myStack.push('[');
        } else if (thisString.charAt(i) == '{') {
            myStack.push('{');
        }

        if (thisString.charAt(i) == ')') {
            if (myStack.peek() == ')') {
                myStack.pop();
            } else {
                System.out.println("Not balanced");
            }
        } else if (thisString.charAt(i) == ']') {
            if (myStack.peek() == ']') {
                myStack.pop();
            } else {
                System.out.println("Not balanced");
            }
        } else if (thisString.charAt(i) == '}') {
            if (myStack.peek() == '}') {
                myStack.pop();
            } else {
                System.out.println("Not balanced");
            }
        }
    }
}