package activity5_readingconsoleinput;

import java.io.*;

public class ReadString
{

    public static void main(String[] args)
    {

        // Ask user for input
        System.out.println("Enter the title of the book:");

        // Create instance of stream reader (decodes inputted characters)
        InputStreamReader isr = new InputStreamReader(System.in);

        // Create instance of buffered reader (reads the decoded characters)
        BufferedReader bfr = new BufferedReader(isr);

        // Initialize input
        String input = "";

        // Try-Catch is REQUIRED to prevent any IOException problems when running 'readLine()'
        try
        {
            input = bfr.readLine();
            bfr.close();
        }
        catch (Exception e)
        {
            System.out.println("An error has occurred!");
        }

        // Final message
        System.out.println("\nThanks! You are reading:\t" + input);

    }

}
