package exercises;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayListPractice {
    // Within main, create a list with at least 10 integers and call
    // your method on the list.
    public static void main(String[] arg) {
        ArrayList<Integer> integerArray = new ArrayList<>(); // Within main, create a list with at least 10 integers and call your method on the list.
        integerArray.add(0);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(4);
        integerArray.add(5);
        integerArray.add(6);
        integerArray.add(7);
        integerArray.add(8);
        integerArray.add(9);

        // print ArrayList
        System.out.println("ArrayList : " + integerArray);
        System.out.println(sumEven(integerArray));

        // Within main, create a list with at least 10 integers and call your method on the list.
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("truck");
        words.add("umbrella");
        words.add("horse");
        words.add("dog");
        words.add("fish");
        words.add("open");
        words.add("picnic");
        words.add("job");
        words.add("happy");

        // print ArrayList
        System.out.println("Words : " + words);
        wordsByLength(words);

        // BONUS: Instead of creating our own list of words, what if we want to use the
        // string from the Array Practice section? Search “Java convert String to ArrayList”
        // online to see how to split a string into the more flexible ArrayList collection.
//        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String str[] = quote.split(" ");
//        List<String> strList = new ArrayList<String>();
//        strList = Arrays.asList(str);
//        for (String string : strList) {
//            System.out.println(string);
//        }
//
//        System.out.println("Quote: " + quote);
//        wordsByLength(strList);

    }
    // 1. Write a static method to find the sum of all the even numbers in an
    // ArrayList.
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    // 2. Write a static method to print out each word in a list that has exactly 5 letters.
    public static void wordsByLength(ArrayList<String> arr) {
        // 3. Modify your code to prompt the user to enter the word length for the search.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

//         loop through an ArrayList with the for-each loop
        for (String word : arr) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }
    }
}

// Resource I found useful for initializing ArrayList https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/

