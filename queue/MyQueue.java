package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    If the input is:
    [name 1]
    [name 2]
    You
    [name 4]
    -1

    The output should be:
    Welcome to the ticket system
    You are number 3 in the queue
    [name 1] has purchased a ticket
    You are number 2 in the queue
    [name 2] has purchased a ticket
    You are first in line!
    You may now purchase your ticket.
 */

public class MyQueue {
    Queue<String> queue = new LinkedList<>();
    
    private MyQueue(Queue<String> queue) {
        this.queue = queue;
    }

    private void addToQueue(String name) {
        queue.add(name);
    }

    private void processQueue() {
        while (!queue.isEmpty()) {
            String currentName = queue.peek();
            if (currentName.equals("You")) {
                if (queue.size() == 1) {
                    System.out.println("You are first in line!");
                    System.out.println("You may now purchase your ticket.");
                } else {
                    System.out.println("You are number " + queue.size() + " in the queue");
                }
            } else {
                System.out.println(currentName + " has purchased a ticket");
            }
            queue.poll();
        }
    }

    public void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MyQueue myQueue = new MyQueue(this.queue);
        String input = scnr.nextLine();

        System.out.println("Welcome to the ticket system");
        
        // while the next input is not "-1"
        while (!input.equals("-1")) {
            myQueue.addToQueue(input);
            System.out.println("Enter a name to add to the queue (or '-1' to finish):");
            input = scnr.nextLine();
        }
        myQueue.processQueue();

        scnr.close();
    }
}
