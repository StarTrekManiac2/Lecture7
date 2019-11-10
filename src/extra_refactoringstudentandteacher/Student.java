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
    public int get_StudentID() { return this.studentID; }
    public String get_CourseTitle() { return this.courseTitle; }


    /* *****************************
     * SETTERS
     * *****************************/
    public void set_StudentID(int id) { this.studentID = id; }
    public void set_CourseTitle(String title) { this.courseTitle = title; }


    /* *****************************
     * OTHER METHODS
     * *****************************/
    // Output student details in full
    public String getStudentDetails()
    {
        String fName = this.get_FirstName();
        String lName = this.get_LastName();
        int age = this.get_Age();
        int id = this.get_StudentID();
        String title = this.get_CourseTitle();

        return "ID:\t\t\t\t\t" + id  +
                "\nName:\t\t\t\t" + lName + ", " + fName +
                "\nAge:\t\t\t\t" + age +
                "\nCourse Title:\t\t" + title;
    }

}
