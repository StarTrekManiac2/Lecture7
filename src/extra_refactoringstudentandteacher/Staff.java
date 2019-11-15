package extra_refactoringstudentandteacher;

public class Staff extends Person
{

    /* *****************************
     * ATTRIBUTES
     * *****************************/
    private int staffID;
    private String jobTitle;


    /* *****************************
     * CONSTRUCTOR
     * *****************************/
    public Staff(String fName, String lName, int age, int id, String title)
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


    /* *****************************
     * OTHER METHODS
     * *****************************/
    // Output student details in full
    public String getStaffDetails()
    {
        String fName = this.get_FirstName();
        String lName = this.get_LastName();
        int age = this.get_Age();
        int id = this.get_StaffID();
        String title = this.get_JobTitle();

        return "ID:\t\t\t\t\t" + id  +
                "\nName:\t\t\t\t" + lName + ", " + fName +
                "\nAge:\t\t\t\t" + age +
                "\nJob Title:\t\t" + title;
    }

}
