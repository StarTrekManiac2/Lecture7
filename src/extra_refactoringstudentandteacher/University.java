package extra_refactoringstudentandteacher;

import java.util.*;

/* **********************************************************************************************
 * **********************************************************************************************
 *  INCOMPLETE
 *      - See ReadMe.txt for To-Do List
 * **********************************************************************************************
 ***********************************************************************************************/

public class University
{

    /* *****************************
     * GLOBAL VARIABLES
     * *****************************/
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<Student>();

    private final static String LINES = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    private final static String MENU =
            "======================================" + "\n" +
            "=========== SYSTEM RUNNING ===========" + "\n" +
            "======================================" + "\n" +
            "Press '1' to Create New Student"        + "\n" +
            "Press '2' to List All Students"         + "\n" +
            "Press '3' to Search for Student";


    /* *****************************
     * MAIN
     * *****************************/
    public static void main(String[] args)
    {

        // Populate student list with sample students
        Student sampleA = new Student("Christopher", "Hill", 25, 20155985, "Computer Science");
        Student sampleB = new Student("Jodie", "Lewis", 21, 20152900, "Psychology");
        Student sampleC = new Student("Alexander", "Wisse", 31, 20159112, "Arts");
        studentList.add(sampleA);
        studentList.add(sampleB);
        studentList.add(sampleC);

        // Initialize main menu option variable
        int choice;

        // Do-While loop for ensuring the program runs
        do {

            // Clear console and print the menu options
            typewriteEffect(MENU + "\n");

            // Record the choice inputted
            choice = s.nextInt();

            // SWITCH statement for option chosen
            switch (choice)
            {
                case 1:
                    typewriteEffect("\n=== CREATE A NEW STUDENT ===");
                    createStudent();
                    break;

                case 2:
                    typewriteEffect("\n=== LIST OF ALL STUDENTS ===");
                    listStudents();
                    break;

                case 3:
                    typewriteEffect("\n=== SEARCH FOR STUDENT(S) ===");
                    findStudent();
                    break;

                default:
                    typewriteEffect("\nInvalid Choice! Try again.");
                    break;
            }

        } while (choice != 0);

    }


    /* *****************************
     * METHODS
     * *****************************/

    // Method for adding a new student to the student list
    private static void createStudent()
    {
        // Declare variables for storing inputs
        String fName;
        String lName;
        String title;
        int age;
        int id;

        // Get user inputs and store them to variable
        typewriteEffect("\nFirst Name:\n");
            fName = s.next();
        typewriteEffect("\nLast Name:\n");
            lName = s.next();
        typewriteEffect("\nAge:\n");
            age = s.nextInt();
        typewriteEffect("\nID Number:\n");
            id = s.nextInt();
        typewriteEffect("\nCourse Title:\n");
            title = s.next().concat(s.nextLine());  // Needed to register whitespace and prevent errors

        // Apply inputs to a new student instance, then add to the student list
        Student newStudent = new Student(fName, lName, age, id, title);
        studentList.add(newStudent);

        // Output success
        typewriteEffect("\nNew Student Created successfully!");
        typewriteEffect(LINES);
    }


    // Method for listing all students from the student list
    private static void listStudents()
    {
        // FOR loop to iterate through entire list of students
        for (int i=0; i<studentList.size(); i++)
        {
            // Output their details by calling the method to print full details
            typewriteEffect("\n" + (i+1) + ".\n" + studentList.get(i).getStudentDetails() + "\n");
        }

        // Output success
        typewriteEffect("\n\nCompleted listing all students!\n\n\n\n\n\n");
    }


    // Method for finding a student in the student list
    private static void findStudent()
    {
        typewriteEffect("\nHow would you like to search?");
        typewriteEffect("\n\t1. Search by Student ID");
        typewriteEffect("\n\t2. Search by Course Title");
        typewriteEffect("\n\t3. Search by Surname\n");

        int choice = s.nextInt();

        if (choice == 1)
        {
            typewriteEffect("\nEnter Student ID:\n");
            int id = s.nextInt();

            for (int i=0; i<studentList.size(); i++)
            {
                int resultCount = 0;

                if (studentList.get(i).get_StudentID() == id)
                {
                    resultCount++;
                    Student current = studentList.get(i);
                    typewriteEffect("\n\nFound " + resultCount + " Results!\n");
                    typewriteEffect("\n\n");
                    typewriteEffect(resultCount + ".\n" + current.getStudentDetails());
                    typewriteEffect("\n\n\n\n\n");
                }
            }
        }
        else if (choice == 2)
        {
            typewriteEffect("\nEnter Course Title:\n");
            String title;
            title = s.next().concat(s.nextLine());

            for (int i=0; i<studentList.size(); i++)
            {
                int resultCount = 0;

                if (studentList.get(i).get_CourseTitle().equals(title))
                {
                    resultCount++;
                    Student current = studentList.get(i);
                    typewriteEffect("\n\nFound " + resultCount + " Results!\n");
                    typewriteEffect("\n\n");
                    typewriteEffect(resultCount + ".\n" + current.getStudentDetails());
                    typewriteEffect("\n\n\n\n\n");
                }
            }
        }
        else if (choice == 3)
        {
            typewriteEffect("\nEnter Surname:\n");
            String lName = s.next();

            for (int i=0; i<studentList.size(); i++)
            {
                int resultCount = 0;

                if (studentList.get(i).get_LastName().equals(lName))
                {
                    resultCount++;
                    Student current = studentList.get(i);
                    typewriteEffect("\n\nFound " + resultCount + " Results!\n");
                    typewriteEffect("\n\n");
                    typewriteEffect(resultCount + ".\n" + current.getStudentDetails());
                    typewriteEffect("\n\n\n\n\n");
                }
            }
        }
        else
        {
            typewriteEffect("\n\n\n\nInvalid Choice! Try again." + LINES);
        }
    }


    // Console typewriter effect - essentially replaces 'SOUT'
    private static void typewriteEffect(String output)
    {
        for (int i=0; i<output.length(); i++)
        {
            System.out.printf("%c", output.charAt(i));
            try
            {
                Thread.sleep(15);  // 0.005 second pause
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }

}
