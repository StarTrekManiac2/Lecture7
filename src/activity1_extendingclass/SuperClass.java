package activity1_extendingclass;

public class SuperClass
{

    // SuperClass method to output a hello message
    public static void hello()
    {
        System.out.println("Hello from the SuperClass!");
    }

    // SuperClass method to output an argument that you inputted
    public static void message(String arg)
    {
        try
        {
            System.out.println("You entered: " + arg + "!");
        }
        catch (Exception e)
        {
            System.out.println("Please input an argument!");
        }
    }

}