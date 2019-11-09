package extra_refactoringstudentandteacher;

public class Person
{
    /* *****************************
     * ATTRIBUTES
     * *****************************/
    private String firstName;
    private String lastName;
    private int age;


    /* *****************************
     * CONSTRUCTOR
     * *****************************/
    public Person(String fName, String lName, int age)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }


    /* *****************************
     * GETTERS
     * *****************************/
    public String getPerson_FirstName() { return this.firstName; }
    public String getPerson_LastName() { return this.lastName; }
    public int getPerson_Age() { return this.age; }


    /* *****************************
     * SETTERS
     * *****************************/
    public void setPerson_FirstName(String fName) { this.firstName = fName; }
    public void setPerson_LastName(String lName) { this.lastName = lName; }
    public void setPerson_Age(int age) { this.age = age; }

}
