package Activity6_studentandteacher;

public class Person
{

    /* ATTRIBUTES */
    private String firstName;
    private String lastName;
    private int age;


    /* CONSTRUCTOR */
    public void setPerson(String fName, String lName, int age)
    {
        firstName = fName;
        lastName = lName;
        age = age;
    }


    /* GETTER */
    public void getPerson()
    {
        System.out.println("FIRST NAME:\t" + firstName);
        System.out.println("SECOND NAME:\t" + lastName);
        System.out.println("AGE:\t\t\t" + age);
    }

}
