package activity4_encapsulation;

public class SafeInstance
{

    public static void main(String[] args)
    {

        // Construct new instance of 'MyCar' object
        MyCar BMW = new MyCar();

        // Set above instance's attributes and then output them
        BMW.setCar("BMW (M5)", "Blue", "Sedan");
        BMW.getCar();

        System.out.println("\n");

        // Construct a second instance of 'MyCar' object
        MyCar Ferrari = new MyCar();

        // Set above instance's attributes and then output them
        Ferrari.setCar("Ferrari (F50)", "Orange", "Exotic/Sports");
        Ferrari.getCar();

    }

}
