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
    private static ArrayList<Staff> staffMembers = new ArrayList<>();

    // Constants
    private final static String SMALL_LINES = "\n\n\n\n";
    private final static String LARGE_LINES = SMALL_LINES + SMALL_LINES;
    private final static String STARTUP_MESSAGE =
            "======================================"    + "\n" +
            "=========== PROGRAM RUNNING =========="    + "\n" +
            "======================================"    + "\n" +
            "Press '1' for Student Portal"              + "\n" +
            "Press '2' for Staff Portal"                + "\n" +
            "\tTo Quit, press '0'";
    private final static String STUDENT_MENU =
            "======================================"    + "\n" +
            "=========== STUDENT PORTAL ==========="    + "\n" +
            "======================================"    + "\n" +
            "Press '1' to Create New Student"           + "\n" +
            "Press '2' to List All Students"            + "\n" +
            "Press '3' to Search for Student"           + "\n" +
            "Press '4' to Edit a Student Record"        + "\n" +
            "Press '5' to Delete a Student Record"      + "\n" +
            "\tTo Return to Portal Menu, Press '0'";
    private final static String STAFF_MENU =
            "======================================"    + "\n" +
            "============ STAFF PORTAL ============"    + "\n" +
            "======================================"    + "\n" +
            "Press '1' to Create New Staff Member"      + "\n" +
            "Press '2' to List All Staff Members"       + "\n" +
            "Press '3' to Search for Staff member"      + "\n" +
            "Press '4' to Edit a Staff Member Record"   + "\n" +
            "Press '5' to Delete a Staff Record"        + "\n" +
            "\tTo Return to Portal Menu, Press '0'";



    /* ******************************************************************************************
     * MAIN METHOD
     */

    public static void main(String[] args) {

        // Populate array-lists with sample data
        Student studentA = new Student("Christopher", "Hill", 25, 20155985, "Computer Science");
        Student studentB = new Student("Jodie", "Lewis", 21, 20152900, "Psychology");
        Student studentC = new Student("Alexander", "Wise", 31, 20159112, "Arts");
        Staff staffA = new Staff("Peter", "Beale", 48, 1225, "Personal Tutor");
        Staff staffB = new Staff("Joanne", "Crichton", 37, 1962, "Department Head");
        Staff staffC = new Staff("Christine", "Ricks", 48, 1225, "Technician");
        studentList.add(studentA);
        studentList.add(studentB);
        studentList.add(studentC);
        staffMembers.add(staffA);
        staffMembers.add(staffB);
        staffMembers.add(staffC);

        // Initialize variable for choice input between student and staff portals
        int portalChoice;

        // Loop ensures the program will run unless the user inputs '0' at the portal menu
        do
        {

            System.out.println(STARTUP_MESSAGE);
            portalChoice = s.nextInt();     // User inputs choice for portal

            System.out.println(SMALL_LINES);

            // Switch to run the chosen portal method or close program
            switch (portalChoice)
            {
                // Closes the program
                case 0:
                    System.out.println("Ending Program................");
                    break;

                // Enters Student Portal
                case 1:
                    studentPortal();
                    break;

                // Enters Staff Portal
                case 2:
                    staffPortal();
                    break;

                // Erroneous input
                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }

        } while (portalChoice !=0);

    }



    /* ******************************************************************************************
     * METHODS - PORTALS
     */

    // STUDENT PORTAL MENU
    private static void studentPortal()
    {
        // Initialize variable for choice input between all student portal options
        int choice;

        do
        {
            System.out.println(STUDENT_MENU);
            choice = s.nextInt();       // User inputs choice

            System.out.println(SMALL_LINES);

            switch (choice)
            {
                // Closes the program
                case 0:
                    System.out.println("Exiting Portal..............." + LARGE_LINES);
                    break;

                // Create New Student via method call
                case 1:
                    System.out.println("=== CREATE A NEW STUDENT ===");
                    createStudent();
                    break;

                // List All Students via method call
                case 2:
                    System.out.println("=== LIST OF ALL STUDENTS ===");
                    listStudents();
                    break;

                // Search For Student via method call
                case 3:
                    System.out.println("=== SEARCH FOR STUDENT(S) ===");
                    findStudent();
                    break;

                // Edit Student Record via method call
                case 4:
                    System.out.println("=== EDIT STUDENT RECORD ===");
                    editStudent();
                    break;

                // Delete Student Record via method call
                case 5:
                    System.out.println("=== DELETE STUDENT RECORD ===");
                    deleteStudent();
                    break;

                // Erroneous input
                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }
        } while (choice != 0);
    }


    // STAFF PORTAL MENU
    private static void staffPortal()
    {
        int choice;

        do
        {
            System.out.println(STAFF_MENU);
            choice = s.nextInt();

            System.out.println(SMALL_LINES);

            // Switch to run the chosen option method or go back
            switch (choice)
            {
                case 0:
                    System.out.println("Ending Program................" + LARGE_LINES);
                    break;

                case 1:
                    System.out.println("=== CREATE A NEW STAFF MEMBER ===");
                    createStaffMember();
                    break;

                case 2:
                    System.out.println("=== LIST OF ALL STAFF MEMBERS ===");
                    listStaffMembers();
                    break;

                case 3:
                    System.out.println("=== SEARCH FOR STAFF MEMBER(S) ===");
                    findStaffMembers();
                    break;

                case 4:
                    System.out.println("=== EDIT STAFF MEMBER ===");
                    editStaffMember();
                    break;

                case 5:
                    System.out.println("=== DELETE STAFF MEMBER RECORD ===");
                    deleteStaffMember();
                    break;

                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }
        } while (choice != 0);
    }



    /* ******************************************************************************************
     * SUB-METHODS - CREATING NEW RECORDS
     */

    // STUDENT
    private static void createStudent()
    {
        // Asks for specified inputs and stores them to variables
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

        // Applies inputs from variables to a new instance of Student, then add to student array-list
        Student newStudent = new Student(fName, lName, age, id, title);
        studentList.add(newStudent);

        System.out.println("\nNew Student Created successfully!");
        System.out.println(SMALL_LINES);
    }


    // STAFF MEMBER
    private static void createStaffMember()
    {
        System.out.println("First Name:");
        String fName = s.next();

        System.out.println("Last Name:");
        String lName = s.next();

        System.out.println("Age:");
        int age = s.nextInt();

        System.out.println("Staff ID:");
        int id = s.nextInt();

        System.out.println("Job Title:");
        String title = s.next().concat(s.nextLine());

        Staff newStaffMember = new Staff(fName, lName, age, id, title);
        staffMembers.add(newStaffMember);

        System.out.println("\nNew Staff Member created successfully!");
        System.out.println(SMALL_LINES);
    }



    /* ******************************************************************************************
     * SUB-METHODS - LISTING EXISTING RECORDS
     */

    // STUDENTS
    private static void listStudents()
    {
        // For loop to iterate through the student list
        for (int i=0; i<studentList.size(); i++)
        {
            // Call 'details' method for each element in the list and output
            String currentDetails = studentList.get(i).getStudentDetails();
            System.out.println((i+1) + ".\n" + currentDetails + "\n");
        }

        System.out.println("\nCompleted listing all students!");
        System.out.println(SMALL_LINES);
    }


    // STAFF MEMBERS
    private static void listStaffMembers()
    {
        for (int i=0; i<staffMembers.size(); i++)
        {
            String currentDetails = staffMembers.get(i).getStaffDetails();
            System.out.println((i+1) + ".\n" + currentDetails + "\n");
        }

        System.out.println("\nCompleted listing all Staff Members!");
        System.out.println(SMALL_LINES);
    }



    /* ******************************************************************************************
     * SUB-METHODS - SEARCHING FOR RECORD(S)
     */

    // STUDENT(S)
    private static void findStudent()
    {
        // Output menu of search methods
        System.out.println("\nHow would you like to search?");
        System.out.println("\t1. Search by Student ID");
        System.out.println("\t2. Search by Course Title");
        System.out.println("\t3. Search by Surname");
        System.out.println("\t\t or Quit with '0'");

        // User inputs a choice
        int choice = s.nextInt();

        // Declare variable for counting the results that will match the criteria later
        int resultCount;

        System.out.println(SMALL_LINES);

        // Switch to run the chosen search method or go back
        switch (choice)
        {
            // Returns to student menu
            case 0:
                break;

            // Search by ID
            case 1:
                // Ask user to input Student ID to search for
                System.out.println("\nEnter Student ID:");
                int id = s.nextInt();

                // Initialize count variable to 0
                resultCount = 0;

                // For-each loop to iterate through each record in student array-list
                for (Student currentStudent : studentList)
                {
                    // If the current student ID matches the user's inputted ID...
                    if (currentStudent.get_StudentID() == id)
                    {
                        // Increment the count to add the match to the total matches
                        resultCount++;

                        // Output details of currently matching record
                        System.out.println("\n" + resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
                    }
                }

                // If there are no matches found...
                if (resultCount == 0)
                {
                    // Output the fact
                    System.out.println("\nNo Results Found!");
                }
                // Else...
                else
                {
                    // Output number of results found
                    System.out.println("\nFound " + resultCount + " Results!");
                }

                break;

            // Search by Course Title
            case 2:
                System.out.println("\nEnter Course Title:");
                String title = s.next().concat(s.nextLine());
                resultCount = 0;

                for (Student currentStudent : studentList)
                {
                    if (currentStudent.get_CourseTitle().equals(title))
                    {
                        resultCount++;
                        System.out.println("\n" + resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
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

            // Search by Surname
            case 3:
                System.out.println("\nEnter Surname:");
                String lName = s.next();
                resultCount = 0;

                for (Student currentStudent : studentList)
                {
                    if (currentStudent.get_LastName().equals(lName))
                    {
                        resultCount++;
                        System.out.println("\n" + resultCount + ".\n" + currentStudent.getStudentDetails() + "\n");
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

            default:
                System.out.println("\nInvalid Choice! Try again.");
                break;
        }

        System.out.println(SMALL_LINES);
    }

    // STAFF MEMBER(S)
    private static void findStaffMembers()
    {
        System.out.println("\nHow would you like to search?");
        System.out.println("\t1. Search by Staff ID");
        System.out.println("\t2. Search byJob Title");
        System.out.println("\t3. Search by Surname");
        System.out.println("\t\t or Quit with '0'");

        int choice = s.nextInt();
        int resultCount;

        System.out.println(SMALL_LINES);

        switch (choice)
        {
            case 0:
                break;

            case 1:
                System.out.println("\nEnter Staff ID:");
                int id = s.nextInt();
                resultCount = 0;

                for (Staff currentStaffMember : staffMembers)
                {
                    if (currentStaffMember.get_StaffID() == id)
                    {
                        resultCount++;
                        System.out.println("\n" + resultCount + ".\n" + currentStaffMember.getStaffDetails() + "\n");
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

            case 2:
                System.out.println("\nEnter Job Title:");
                String title = s.next().concat(s.nextLine());
                resultCount = 0;

                for (Staff currentStaffMember : staffMembers)
                {
                    if (currentStaffMember.get_JobTitle().equals(title))
                    {
                        resultCount++;
                        System.out.println("\n" + resultCount + ".\n" + currentStaffMember.getStaffDetails() + "\n");
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

            case 3:
                System.out.println("\nEnter Surname:");
                String lName = s.next();
                resultCount = 0;

                for (Staff currentStaffMember : staffMembers)
                {
                    if (currentStaffMember.get_LastName().equals(lName))
                    {
                        resultCount++;
                        System.out.println("\n" + resultCount + ".\n" + currentStaffMember.getStaffDetails() + "\n");
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

            default:
                System.out.println("\nInvalid Choice! Try again.");
                break;
        }

        System.out.println(SMALL_LINES);
    }



    /* ******************************************************************************************
     * SUB-METHODS - EDITING EXISTING RECORD
     */

    // STUDENT
    private static void editStudent()
    {
        // Ask for Student ID input from user
        System.out.println("\nEnter Student ID:");
        int id = s.nextInt();

        // Boolean initialization to check a record exists before editing
        boolean exists = false;

        // Initialize variable for storing element value of the list for reuse later
        int element = 0;

        // For loop to iterate through the student records
        for (int i=0; i<studentList.size(); i++)
        {
            // If Student ID of current record matches user-inputted ID
            if (studentList.get(i).get_StudentID() == id)
            {
                System.out.println("\nFound record successfully!");

                // Due to a match, set boolean variable to true
                exists = true;

                // Save element value to current element of the array
                element = i;
            }
        }

        // IF a match was found
        if (exists)
        {
            // Fetch the record from the array-list using the saved element value
            Student currentStudent = studentList.get(element);

            // Output menu of options for user input for editing the record
            System.out.println("\n" + currentStudent.getStudentDetails() + "\n");
            System.out.println("\nWhat do you need to edit?");
            System.out.println("\t1. Edit Student ID");
            System.out.println("\t2. Edit Course Title");
            System.out.println("\t3. Edit Names");
            System.out.println("\t4. Edit Age");
            System.out.println("\t\t or Quit with '0'");

            // User inputs choice
            int choice = s.nextInt();

            System.out.println(SMALL_LINES);

            // Switch to run the chosen edit option or go back
            switch (choice)
            {
                // Return to student portal
                case 0:
                    break;

                // Edit Student ID
                case 1:
                    // Ask for user input of replacement ID
                    System.out.println("\nPlease enter the new ID number:");
                    int newID = s.nextInt();

                    // Apply new ID to current ID of the student
                    currentStudent.set_StudentID(newID);

                    System.out.println("\nUpdated Student Record:\n");
                    break;

                // Edit Course Title
                case 2:
                    // Ask for user input of replacement Course Title
                    System.out.println("\nPlease enter the new Course Title:");
                    String newTitle= s.next().concat(s.nextLine());

                    // Apply new title to current title of the student
                    currentStudent.set_CourseTitle(newTitle);

                    System.out.println("\nUpdated Student Record:\n");
                    break;

                // Edit First and Last Names
                case 3:
                    // Ask for user input for new names and replace current student names
                    System.out.println("\nPlease enter the new First Name:");
                    String newFName= s.next();

                    currentStudent.set_FirstName(newFName);

                    System.out.println("\nPlease enter the new Surname:");
                    String newLName= s.next();

                    currentStudent.set_LastName(newLName);

                    System.out.println("\nUpdated Student Record:\n");
                    break;

                // Edit Age
                case 4:
                    // Ask for user input of replacement Age
                    System.out.println("\nPlease enter the new Age:");
                    int newAge= s.nextInt();

                    // Apply new age to current age of the student
                    currentStudent.set_Age(newAge);

                    System.out.println("\nUpdated Student Record:\n");
                    break;

                // Erroneous input
                default:
                    System.out.println("\nInvalid Choice! Try again.");
                    break;
            }
        }
        // ELSE if no record was found...
        else
        {
            // Output the fact
            System.out.println("\nNo record found. Try again!");
        }

        System.out.println(SMALL_LINES);
    }


    // STAFF MEMBER
    private static void editStaffMember()
    {
        System.out.println("\nEnter Staff ID:");
        int id = s.nextInt();
        boolean exists = false;
        int element = 0;

        for (int i=0; i<staffMembers.size(); i++)
        {
            if (staffMembers.get(i).get_StaffID() == id)
            {
                System.out.println("\nFound record successfully!");
                exists = true;
                element = i;
            }
        }

        if (exists)
        {
            Staff currentStaffMember = staffMembers.get(element);

            System.out.println("\n" + currentStaffMember.getStaffDetails() + "\n");
            System.out.println("\nWhat do you need to edit?");
            System.out.println("\t1. Edit Staff ID");
            System.out.println("\t2. Edit Job Title");
            System.out.println("\t3. Edit Names");
            System.out.println("\t4. Edit Age");
            System.out.println("\t\t or Quit with '0'");

            int choice = s.nextInt();

            System.out.println(SMALL_LINES);

            switch (choice)
            {
                case 0:
                    break;

                case 1:
                    System.out.println("\nPlease enter the new ID number:");
                    int newID = s.nextInt();

                    currentStaffMember.set_StaffID(newID);

                    System.out.println("\nUpdated Staff Member Record:\n");
                    break;

                case 2:
                    System.out.println("\nPlease enter the new Job Title:");
                    String newTitle= s.next().concat(s.nextLine());

                    currentStaffMember.set_JobTitle(newTitle);

                    System.out.println("\nUpdated Staff Member Record:\n");
                    break;

                case 3:
                    System.out.println("\nPlease enter the new First Name:");
                    String newFName= s.next();

                    currentStaffMember.set_FirstName(newFName);

                    System.out.println("\nPlease enter the new Surname:");
                    String newLName= s.next();

                    currentStaffMember.set_LastName(newLName);

                    System.out.println("\nUpdated Staff Member Record:\n");
                    break;

                case 4:
                    System.out.println("\nPlease enter the new Age:");
                    int newAge= s.nextInt();

                    currentStaffMember.set_Age(newAge);

                    System.out.println("\nUpdated Staff Member Record:\n");
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

        System.out.println(SMALL_LINES);
    }



    /* ******************************************************************************************
     * SUB-METHODS - DELETING EXISTING RECORD
     */

    // STUDENT
    private static void deleteStudent()
    {
        System.out.println("\nEnter Student ID:");
        int id = s.nextInt();
        boolean exists = false;
        int element = 0;

        for (int i=0; i<studentList.size(); i++)
        {
            if (studentList.get(i).get_StudentID() == id)
            {
                System.out.println("\nAttempting to delete the following record:");
                exists = true;
                element = i;
            }
        }

        // IF there is match
        if (exists)
        {
            Student currentStudent = studentList.get(element);

            System.out.println(currentStudent.getStudentDetails() + "\n\n");
            System.out.println("Are you sure you want to delete this record?");
            System.out.println("WARNING - record will be permanently removed... well... until restarting the program.");
            System.out.println("\n\tType 'Y' or 'Yes' to delete, or any other key to cancel");

            String choice = s.next();

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"))
            {
                studentList.remove(currentStudent);
                System.out.println("\nStudent record successfully deleted from system.");
            }
            else
            {
                System.out.println("\nCancelling deletion...");
            }
        }
        else
        {
            System.out.println("\nNo record found. Try again!");
        }

        System.out.println(SMALL_LINES);
    }


    // STAFF MEMBER
    private static void deleteStaffMember()
    {
        System.out.println("\nEnter Staff ID:");
        int id = s.nextInt();
        boolean exists = false;
        int element = 0;

        for (int i=0; i<staffMembers.size(); i++)
        {
            if (staffMembers.get(i).get_StaffID() == id)
            {
                System.out.println("\nAttempting to delete the following record:");
                exists = true;
                element = i;
            }
        }

        // IF there is match
        if (exists)
        {
            Staff currentStaffMember = staffMembers.get(element);

            System.out.println(currentStaffMember.getStaffDetails() + "\n\n");
            System.out.println("Are you sure you want to delete this record?");
            System.out.println("WARNING - record will be permanently removed... well... until restarting the program.");
            System.out.println("\n\tType 'Y' or 'Yes' to delete, or any other key to cancel");

            String choice = s.next();

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"))
            {
                staffMembers.remove(currentStaffMember);
                System.out.println("\nStaff Member record successfully deleted from system.");
            }
            else
            {
                System.out.println("\nCancelling deletion...");
            }
        }
        else
        {
            System.out.println("\nNo record found. Try again!");
        }

        System.out.println(SMALL_LINES);
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
