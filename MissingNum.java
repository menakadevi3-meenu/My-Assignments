package week3.day1;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Loop through the array and find the missing number
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            boolean found = false;

            // Check if 'i' exists in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If not found, it's the missing number
            if (!found) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }
}


