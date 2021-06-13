package exercises;
//import Arrays to be used to print the individual words from the quote
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // 1. Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        // 2. Loop through the array and print out each value,
        for (int j : integerArray) {
            //then modify the loop to only print the odd numbers.
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        String quote = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        // 3. Use the split method to divide the string at each space and store the individual words in an array.
        String[] words = quote.split(" ");
        // 4. Print the array of words to verify that your code works
        System.out.println(Arrays.toString(words));

        // 5. Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}


