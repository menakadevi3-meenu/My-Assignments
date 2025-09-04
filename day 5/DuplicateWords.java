package week3.day2;

public class DuplicateWords {

	public static class RemoveDuplicateWords {
	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        //Split the text into an array of words using space as the delimiter
	        String[] words = text.split(" ");
            //Initialize a variable ‘count’ to keep track of the number of duplicate words found
             int count = 0;

	        // Compare each word with every other word
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	        // Case-insensitive comparison and check if word is not already removed
	                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
	                    words[j] = ""; // Remove duplicate
	                    count++;
	                }
	            }
	        }
	        // Print result if duplicates were found
	        if (count > 0) {
	            System.out.println("Modified text without duplicates:");
	            for (String word : words) {
	                if (!word.equals("")) {
	                    System.out.print(word + " ");
	                }
	            }
	        } else {
	            System.out.println("No duplicates found.");
	        }
	    }
	}


}
