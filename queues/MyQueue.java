package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    private Queue<String> queue = new LinkedList<>();

    public MyQueue() {
    }

    private void addToQueue(String name) {
        queue.add(name);
    }

    private int getYourPosition() {
        int position = 1;
        for (String name : queue) {
            if (name.equals("You")) {
                return position;
            }
            position++;
        }
        return -1;
    }

    private void processQueue() {
        while (!queue.isEmpty()) {
            int yourPosition = getYourPosition();

            if (yourPosition == 1) {
                System.out.println("You are first in line!");
                System.out.println("You may now purchase your ticket.");
                break;
            } else if (yourPosition > 1) {
                System.out.println("You are number " + yourPosition + " in the queue");
            }

            String currentName = queue.poll();
            System.out.println(currentName + " has purchased a ticket");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();

        System.out.println("Welcome to the ticket system");

        String input = scnr.nextLine();

        while (!input.equals("-1")) {
            myQueue.addToQueue(input);
            input = scnr.nextLine();
        }

        myQueue.processQueue();
        scnr.close();
    }
}