package week3.day1;

public class OddIndexToUppercase {
		
		public static void main(String[] args) {
	        String test = "changeme";
	        char[] charArray = test.toCharArray(); // Convert string to character array

	        // Loop from end to start
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            if (i % 2 != 0) { // Check for odd index
	                charArray[i] = Character.toUpperCase(charArray[i]); // Convert to uppercase
	            }
	        }

	        // Convert the modified character array back to a string
	        String result = new String(charArray);
	        System.out.println("Modified string: " + result);
	    }
	}
