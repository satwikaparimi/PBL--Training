import java.util.*;

class MaxMinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 20;
        int[] arr = new int[size];

        // Input 20 elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Assume first element is both max and min
        int firstMax = arr[0], secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        int firstMin = arr[0], secondMin = Integer.MAX_VALUE, thirdMin = Integer.MAX_VALUE;

        // Loop through array
        for (int i = 0; i < size; i++) {
            int num = arr[i];

            // Find top 3 maximum
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                thirdMax = num;
            }

            // Find top 3 minimum
            if (num < firstMin) {
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                thirdMin = secondMin;
                secondMin = num;
            } else if (num < thirdMin && num != firstMin && num != secondMin) {
                thirdMin = num;
            }
        }

        // Print results
        System.out.println("Smallest 3 numbers: " + firstMin + " " + secondMin + " " + thirdMin);
        System.out.println("Largest 3 numbers: " + firstMax + " " + secondMax + " " + thirdMax);

        sc.close();
    }
}
