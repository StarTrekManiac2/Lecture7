package extra_refactoringstudentandteacher;

public class Lecturer extends Person
{

    /* ATTRIBUTES */
    private int staffID;
    private String jobTitle;

    /* CONSTRUCTOR */
    public void setLecturer(String fName, String lName, int age, int id, String title)
    {
        setPerson(fName, lName, age);   // Grabs the other details from the SuperClass (Person)
        staffID = id;
        jobTitle = title;
    }


    /* GETTER */
    public void getLecturer()
    {
        System.out.println("STAFF ID:\t\t" + staffID);
        System.out.println("JOB TITLE:\t\t" + jobTitle);
        System.out.println("NAME:\t\t\t" + firstName + " " + lastName);
        System.out.println("AGE:\t\t\t" + age);
    }

}
