package activity1_extendingclass;

public class SubClass extends SuperClass
{

    public static void main(String[] args)
    {

        // Output the overwritten hello message from within this class
        hello();

        // Output the original hello message from the SuperClass
        SuperClass.hello();

        // Call 'Message' method from SuperClass by utilizing the String array in this main PSVM
        message("Human");

    }


    // Override 'hello' method from SuperClass for different message
    public static void hello()
    {
        try
        {
            System.out.println("Hello from the SubClass!");
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }

}
