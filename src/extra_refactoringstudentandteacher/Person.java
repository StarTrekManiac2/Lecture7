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
    public String get_FirstName() { return this.firstName; }
    public String get_LastName() { return this.lastName; }
    public int get_Age() { return this.age; }


    /* *****************************
     * SETTERS
     * *****************************/
    public void set_FirstName(String fName) { this.firstName = fName; }
    public void set_LastName(String lName) { this.lastName = lName; }
    public void set_Age(int age) { this.age = age; }

}
