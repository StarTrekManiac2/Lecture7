package extra_refactoringstudentandteacher;

public class Student extends Person
{

    /* *****************************
     * ATTRIBUTES
     * *****************************/
    private int studentID;
    private String courseTitle;


    /* *****************************
     * CONSTRUCTOR
     * *****************************/
    public Student(String fName, String lName, int age, int id, String title)
    {
        super(fName, lName, age);   // Grabs the other details from the SuperClass (Person)
        studentID = id;
        courseTitle = title;
    }


    /* *****************************
     * GETTERS
     * *****************************/
    public int getLecturer_StudentID() { return this.studentID; }
    public String getLecturer_JobTitle() { return this.courseTitle; }


    /* *****************************
     * SETTERS
     * *****************************/
    public void setLecturer_StaffID(int id) { this.studentID = id; }
    public void setLecturer_JobTitle(String title) { this.courseTitle = title; }


}
