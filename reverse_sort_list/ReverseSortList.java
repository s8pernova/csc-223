package reverse_sort_list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReverseSortList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements;                // Number of integers in user's list

      System.out.print("Total number of elements: ");
      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      List<Integer> userList = new ArrayList<>();   // List of numElement integers specified by the user
      
      /* Type your code here. */

      // populate userList
      for (int i = 0; i < numElements; i++) {
         System.out.print("Item " + (i+1) + ": ");
         int nextEl = scnr.nextInt();
         userList.add(nextEl);
      }

      // Sort
      for (int i = 0; i < userList.size() - 1; i++) {
        int curr = userList.get(i);
        int next = userList.get(i+1);

        if (curr > next) {
            int temp = userList.get(i);
            userList.set(i, userList.get(i+1));
            userList.set(i+1, temp);
            userList.add(0, curr);
        }
      }

      // Print
      System.out.print(userList);
   }
}
