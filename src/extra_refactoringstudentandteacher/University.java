package extra_refactoringstudentandteacher;

import java.util.*;

public class University
{

    /* *****************************
     * GLOBAL VARIABLES
     * *****************************/
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    private final static String MENU =
            "======================================" + "\n" +
            "=========== SYSTEM RUNNING ===========" + "\n" +
            "======================================" + "\n" +
            "Press '1' to Create New Student"           + "\n" +
            "Press '2' to List All Students"         + "\n" +
            "Press '3' to Search for Student";


    /* *****************************
     * MAIN
     * *****************************/
    public static void main(String[] args)
    {

        // Initialize main menu option variable
        int choice = 0;

        // Do-While loop for ensuring the program runs
        do {

            // Print the menu options
            System.out.println(MENU);

            // Record the choice inputted
            choice = s.nextInt();

            // IF-ELSE statements for option chosen
            if (choice == 1)
            {
                createStudent();
            }
            else if (choice == 2)
            {
                listStudents();
            }
            else if (choice == 3)
            {
                findStudent();
            }
            else
            {
                System.out.println("Invalid Choice! Try again.");
                choice = 0;
            }

        } while (choice != 0);

    }


    /* *****************************
     * METHODS
     * *****************************/

    // Method for adding a new student to the student list
    private static void createStudent()
    {
        System.out.println("UNFINISHED");
    }

    // Method for listing all students from the student list
    private static void listStudents()
    {
        System.out.println("UNFINISHED");
    }

    // Method for finding a student in the student list
    private static void findStudent()
    {
        System.out.println("UNFINISHED");
    }

}
