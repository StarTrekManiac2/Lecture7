package Activity6_studentandteacher;

public class Student extends Person
{

    /* ATTRIBUTES */
    private int studentID;
    private String courseTitle;

    /* CONSTRUCTOR */
    public void setStudent(String fName, String lName, int age, int id, String title)
    {
        setPerson(fName, lName, age);   // Grabs the other details from the SuperClass (Person)
        studentID = id;
        courseTitle = title;
    }


    /* GETTER */
    public void getStudent()
    {
        System.out.println("STUDENT ID:\t\t" + studentID);
        System.out.println("COURSE TITLE:\t" + courseTitle);
        System.out.println("NAME:\t\t\t" + firstName + " " + lastName);
        System.out.println("AGE:\t\t\t" + age);
    }

}
