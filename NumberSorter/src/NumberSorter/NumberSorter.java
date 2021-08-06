package NumberSorter;

import java.util.Scanner;

public class NumberSorter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will Sort a list of numbers and display them in ascending orderand find the average, minimum and maximum numbers");
        System.out.println("How many seperate numbers would you like to sort?.");
        int length = (input.nextInt());
        int[] list = new int[length];
        int[] unsorted = new int[length];
        for (int j = 0; j < length; j++) {
            System.out.println("Enter number " + (j + 1) + ":");
            int num = input.nextInt();
            list[j] = num;
            unsorted[j] = num;
        }
        for (int i = 0; i < list.length; i++) {
            int index = i;
            for (int k = i; k < list.length; k++) {
                if (list[k] < list[index]) {
                    index = k;
                }
            }
            int lessernum = list[index];
            list[index] = list[i];
            list[i] = lessernum;
        }
        System.out.println("");
        System.out.println("Unsorted list of numbers:");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + ",");
        }
        int total = 0;
        System.out.println("");
        System.out.println("Sorted list of numbers:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
            total = total + list[i];
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / length));
        System.out.println("Minimum: " + list[0]);
        System.out.println("Maximum: " + list[length - 1]);

    }
}
