package Activity6_studentandteacher;

public class Person
{

    /* ATTRIBUTES */
    public String firstName;
    public String lastName;
    public int age;


    /* CONSTRUCTOR */
    public void setPerson(String fName, String lName, int age)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }


    /* GETTER */
    public void getPerson()
    {
        System.out.println("FIRST NAME:\t" + firstName);
        System.out.println("SECOND NAME:\t" + lastName);
        System.out.println("AGE:\t\t\t" + age);
    }

}
