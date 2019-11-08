package activity7_instancesarraylist;

import java.util.*;

public class ArrayListObjects
{

    public static void main(String[] args)
    {

        // Create ArrayList to store instances of Car object
        ArrayList<Car> cars = new ArrayList<Car>();

        // Create first instance of a Car object and apply attributes
        Car BMW = new Car();
        BMW.setCar("BMW (M5)", "Blue", "Sedan");
        BMW.getCar();

        // Create second instance of a Car object and apply attributes
        Car Ferrari = new Car();
        Ferrari.setCar("Ferrari (F50)", "Orange", "Exotic/Sports");
        Ferrari.getCar();

        // Add the created instances to the ArrayList
        cars.add(BMW);
        cars.add(Ferrari);

        // Output the contents of the ArrayList by calling the GET method from Car class
        for (int j=0; j<cars.size(); j++)
        {
            cars.get(j);
        }

    }

}
