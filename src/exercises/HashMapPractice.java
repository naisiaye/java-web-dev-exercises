package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 1. It takes in student names and ID numbers (as integers) instead of names and
// grades.

// 2. The keys should be the IDs and the values should be the names.
public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID numbers
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}