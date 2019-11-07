package Activity6_studentandteacher;

public class Student extends Person
{

    /* ATTRIBUTES */
    private int studentID;
    private String courseTitle;

    /* CONSTRUCTOR */
    public void setStudent(int id, String title)
    {
        studentID = id;
        courseTitle = title;
    }


    /* GETTER */
    public void getStudent()
    {
        System.out.println("STUDENT ID:\t\t" + studentID);
        System.out.println("COURSE TITLE:\t" + courseTitle);
    }

}
