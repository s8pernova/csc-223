package selection_sort;
public class SelectionSortAlgorithm {
    private static int[] myList = { 61, 76, 54, 15 };
    
    public static void main(String[] args) {
        
        for (int i = 0; i < myList.length; i++) {
            int min = i;

            for (int j = 0; j < myList.length; j++) {
                if (myList[j] < myList[min]) {
                    min = j;
                }
            }

            // Swap myList[j] with myList[i]
            int tmp = myList[i];
            myList[i] = myList[min];
            myList[min] = tmp;
        }

        System.out.println("Sorted list: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }
}

