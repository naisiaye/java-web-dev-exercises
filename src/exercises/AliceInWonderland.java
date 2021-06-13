package exercises;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to search for?");
        String searchWord = input.next();
        input.close();
        int intIndex = sentence.toLowerCase().indexOf(searchWord.toLowerCase());
        if(intIndex == -1){
            System.out.println("false");
        } else {
            String replaced = sentence.toLowerCase().replaceFirst(searchWord.toLowerCase(),"");
            System.out.printf("The index is %s and the length is %s characters long",intIndex,searchWord.length());
            System.out.println("\n" +

                    replaced);
        }
    }
}