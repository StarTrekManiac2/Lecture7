package activity1_extendingclass;

public class SuperClass
{

    // SuperClass method to output a hello message
    public static void message(String arg)
    {
        try
        {
            System.out.println("Hello, " + arg + "!");
        }
        catch(Exception e)
        {
            System.out.println("Please input your name!");
        }
    }

}