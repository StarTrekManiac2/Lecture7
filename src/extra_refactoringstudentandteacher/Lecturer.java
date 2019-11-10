package extra_refactoringstudentandteacher;

public class Lecturer extends Person
{

    /* *****************************
     * ATTRIBUTES
     * *****************************/
    private int staffID;
    private String jobTitle;


    /* *****************************
     * CONSTRUCTOR
     * *****************************/
    private Lecturer(String fName, String lName, int age, int id, String title)
    {
        super(fName, lName, age);   // Grabs the other details from the SuperClass (Person)
        staffID = id;
        jobTitle = title;
    }


    /* *****************************
     * GETTERS
     * *****************************/
    public int get_StaffID() { return this.staffID; }
    public String get_JobTitle() { return this.jobTitle; }


    /* *****************************
     * SETTERS
     * *****************************/
    public void set_StaffID(int id) { this.staffID = id; }
    public void set_JobTitle(String title) { this.jobTitle = title; }

}
