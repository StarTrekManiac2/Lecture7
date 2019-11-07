package activity2_objectclasses;

public class FirstObject
{

    public static void main(String[] args)
    {

        // Get the object's colour and body type from Object class (Car)
        System.out.println("PAINT STYLE:\t" + Car.colour);
        System.out.println("BODY TYPE:\t\t" + Car.bodyType);

        // Call acceleration method from Object class (Car)
        System.out.println(Car.accelerate());

    }

}
