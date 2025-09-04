package week3.day1;

public class ReverseOddWords {

		 public static void main(String[] args) {
		        String test = "I am a software tester";

		        // Step 1: Split the string into words
		        String[] words = test.split(" ");

		        // Step 2: Traverse through each word
		        for (int i = 0; i < words.length; i++) {
		            if (i % 2 != 0) {
		                // Step 3: Reverse the word at odd index
		                char[] chars = words[i].toCharArray();
		                for (int j = chars.length - 1; j >= 0; j--) {
		                    System.out.print(chars[j]);
		                }
		            } else {
		                // Step 4: Print the word at even index as-is
		                System.out.print(words[i]);
		            }

		            // Add space after each word
		            System.out.print(" ");
		        }
		    }
        }

