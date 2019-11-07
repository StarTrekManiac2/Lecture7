package activity3_objectinstances;

public class FirstInstance
{

    public static void main(String[] args)
    {

        // Fetch car information and call acceleration method (from 'Car' object class)
        System.out.println("PAINT STYLE:\t" + Car.colour);
        System.out.println("BODY TYPE:\t\t" + Car.bodyType);
        System.out.println(Car.accelerate());

        // Create new instance of 'Car' class (an object)
        Car BMW = new Car();

        // Now fetch the information as above for the new instance
        System.out.println("\nBMW:");
        System.out.println("PAINT STYLE:\t" + BMW.colour);
        System.out.println("BODY TYPE:\t\t" + BMW.bodyType);

    }

}
