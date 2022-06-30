
/*  Find cealing number of given element in sorted array */

import java.util.*;

public class CealingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of sorted array ");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter target number whose ceailing is to bef  find :");
        int target = sc.nextInt();
        int flag = 0;
        int low = 0;
        int mid = 0;
        int high = size - 1;

        // Binary search logic start here to find cealing of an element

        while (low <= high) {
            // To Tackle integer overflow problem

            mid = low + (high - low) / 2;
            if (array[mid] == target) {
                flag = 1;
                break;

            }

            else if (array[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }

        if (flag == 1) {
            System.out.println("Cealing  of a number is  :" + array[mid]);
        } else {

            // When condition of while breaks low pointer points to the cealing element.
            System.out.println("Cealing of a number is :" + array[low]);
        }

    }
}
