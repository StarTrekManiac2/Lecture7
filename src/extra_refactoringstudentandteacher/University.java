package extra_refactoringstudentandteacher;

import java.util.*;

public class University
{

    /* ******************************************************************************************
     * GLOBAL VARIABLES
     */

    // Declarations
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<>();

    // Constants
    private final static String MENU =
            "======================================" + "\n" +
            "=========== SYSTEM RUNNING ===========" + "\n" +
            "======================================" + "\n" +
            "Press '1' to Create New Student"        + "\n" +
            "Press '2' to List All Students"         + "\n" +
            "Press '3' to Search for Student"        + "\n" +
            "Press '4' to Edit a Student Record"     + "\n" +
            "\tTo Quit, Press '0'";



    /* ******************************************************************************************
     * MAIN METHOD
     */

    public static void main(String[] args)
    {

        // Populate array-list with sample data
        Student sampleA = new Student("Christopher", "Hill", 25, 20155985, "Computer Science");
        Student sampleB = new Student("Jodie", "Lewis", 21, 20152900, "Psychology");
        Student sampleC = new Student("Alexander", "Wisse", 31, 20159112, "Arts");
        studentList.add(sampleA);
        studentList.add(sampleB);
        studentList.add(sampleC);

        int choice;

        // Loop ensures the program runs until user inputs '0' as main menu choice
        do {

            System.out.println(MENU);
            choice = s.nextInt();

            switch (choice)
            {
                // Closes the program
                case 0:
                    System.out.println("Ending Program................");
                    break;

                // Create New Student via method call
                case 1:
                    System.out.println("=== CREATE A NEW STUDENT ===");
                    createStudent();
                    break;

                // List All Students in array-list via method call
                case 2:
                    System.out.println("=== LIST OF ALL STUDENTS ===");
                    listStudents();
                    break;

                // Search For Student in array-list via method call
                case 3:
                    System.out.println("=== SEARCH FOR STUDENT(S) ===");
                    findStudent();
                    break;

                // Edit Student Record via method call
                case 4:
                    System.out.println("=== EDIT STUDENT RECORD ===");
                    editStudent();
                    break;

                // Erroneous input
                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }

        } while (choice != 0);

    }



    /* ******************************************************************************************
     * PRIMARY METHODS
     */

    /* CREATE A NEW STUDENT */
    private static void createStudent()
    {
        System.out.println("First Name:");
        String fName = s.next();

        System.out.println("Last Name:");
        String lName = s.next();

        System.out.println("Age:");
        int age = s.nextInt();

        System.out.println("ID Number:");
        int id = s.nextInt();

        System.out.println("Course Title:");
        String title = s.next().concat(s.nextLine());  // registers a space

        Student newStudent = new Student(fName, lName, age, id, title);
        studentList.add(newStudent);

        System.out.println("\nNew Student Created successfully!");
    }


    /* LIST ALL STUDENTS */
    private static void listStudents()
    {
        for (int i=0; i<studentList.size(); i++)
        {
            String currentDetails = studentList.get(i).getStudentDetails();
            System.out.println((i+1) + ".\n" + currentDetails + "\n");
        }

        System.out.println("\nCompleted listing all students!");
    }


    /* FIND A STUDENT IN THE LIST */
    private static void findStudent()
    {
        System.out.println("\nHow would you like to search?");
        System.out.println("\t1. Search by Student ID");
        System.out.println("\t2. Search by Course Title");
        System.out.println("\t3. Search by Surname");

        int choice = s.nextInt();
        int resultCount;

        switch (choice)
        {
            case 1:     // IF Searching by ID
                System.out.println("\nEnter Student ID:");
                int id = s.nextInt();
                resultCount = 0;

                for (Student currentStudent : studentList)
                {
                    if (currentStudent.get_StudentID() == id)
                    {
                        resultCount++;
                        System.out.println(resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
                    }
                }

                if (resultCount == 0)
                {
                    System.out.println("\nNo Results Found!");
                }
                else
                {
                    System.out.println("\nFound " + resultCount + " Results!");
                }

                break;

            case 2:     // IF Searching by Course Title
                System.out.println("\nEnter Course Title:");
                String title = s.next().concat(s.nextLine());
                resultCount = 0;

                for (Student currentStudent : studentList)
                {
                    if (currentStudent.get_CourseTitle().equals(title))
                    {
                        resultCount++;
                        System.out.println(resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
                    }
                }

                if (resultCount == 0)
                {
                    System.out.println("\nNo Results Found!");
                }
                else
                {
                    System.out.println("\nFound " + resultCount + " Results!");
                }

                break;

            case 3:     // IF Searching by Surname
            {
                System.out.println("\nEnter Surname:");
                String lName = s.next();
                resultCount = 0;

                for (Student currentStudent : studentList)
                {
                    if (currentStudent.get_LastName().equals(lName))
                    {
                        resultCount++;
                        System.out.println(resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
                    }
                }

                if (resultCount == 0)
                {
                    System.out.println("\nNo Results Found!");
                }
                else
                {
                    System.out.println("\nFound " + resultCount + " Results!");
                }

                break;
            }
            default:
                System.out.println("\nInvalid Choice! Try again.");
                break;
        }
    }


    /* EDIT A STUDENT RECORD */
    private static void editStudent()
    {
        System.out.println("\nEnter Student ID:");
        int id = s.nextInt();
        boolean exists = false;
        int element = 0;

        for (int i=0; i<studentList.size(); i++)
        {
            if (studentList.get(i).get_StudentID() == id)
            {
                System.out.println("\nFound record successfully!");
                exists = true;
                element = i;
            }
        }

        // IF there is a match
        if (exists)
        {
            Student currentStudent = studentList.get(element);

            System.out.println("CURRENT RECORD:\n" + studentList.get(element).getStudentDetails() + "\n");
            System.out.println("\nWhat do you need to edit?");
            System.out.println("\t1. Edit Student ID");
            System.out.println("\t2. Edit Course Title");
            System.out.println("\t3. Edit Names");
            System.out.println("\t4. Edit Age");
            System.out.println("\t\t or press '0' to quit!");

            int choice = s.nextInt();

            switch (choice)
            {
                case 1:     // IF editing Student ID
                    System.out.println("\nPlease enter the new ID number:");
                    int newID = s.nextInt();

                    currentStudent.set_StudentID(newID);

                    System.out.println("\nUpdated Student Record:\n");
                    currentStudent.getStudentDetails();

                    break;

                case 2:     // IF editing Course Title
                    System.out.println("\nPlease enter the new Course Title:");
                    String newTitle= s.next().concat(s.nextLine());

                    currentStudent.set_CourseTitle(newTitle);

                    System.out.println("\nUpdated Student Record:\n");
                    currentStudent.getStudentDetails();

                    break;

                case 3:     // IF editing First and Last Names
                    System.out.println("\nPlease enter the new First Name:");
                    String newFName= s.next();

                    currentStudent.set_FirstName(newFName);

                    System.out.println("\nPlease enter the new Surname:");
                    String newLName= s.next();

                    currentStudent.set_LastName(newLName);

                    System.out.println("\nUpdated Student Record:\n");
                    currentStudent.getStudentDetails();

                    break;

                case 4:     // IF editing Age
                    System.out.println("\nPlease enter the new Age:");
                    int newAge= s.nextInt();

                    currentStudent.set_Age(newAge);

                    System.out.println("\nUpdated Student Record:\n");
                    currentStudent.getStudentDetails();

                    break;

                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }
        }
        else
        {
            System.out.println("\nNo record found. Try again!");
        }
    }



    /* ******************************************************************************************
     * SECONDARY METHODS
     */

//    /* TYPE-WRITER EFFECT FOR CONSOLE */
//    private static void typewriteEffect(String output)
//    {
//        for (int i=0; i<output.length(); i++)
//        {
//            System.out.printf("%c", output.charAt(i));
//            try
//            {
//                Thread.sleep(8);  // 0.0008 second pause
//            }
//            catch (InterruptedException e)
//            {
//                Thread.currentThread().interrupt();
//            }
//        }
//
//        // EXAMPLE METHOD CALL
//        // typewriteEffect("put your SOUT stuff here");
//    }

}
