package Activity6_studentandteacher;

public class Lecturer extends Person
{

    /* ATTRIBUTES */
    private int staffID;
    private String jobTitle;

    /* CONSTRUCTOR */
    public void setLecturer(int id, String title)
    {
        staffID = id;
        jobTitle = title;
    }


    /* GETTER */
    public void getLecturer()
    {
        System.out.println("STAFF ID:\t" + staffID);
        System.out.println("JOB TITLE:\t" + jobTitle);
    }

}
