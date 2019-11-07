package activity4_encapsulation;

public class MyCar
{

    // Object attributes
    private String manufacturer;
    private String colour;
    private String bodyType;

    // Object methods
    private String accelerate()
    {
        return "Accelerating...";
    }


    // Object creation (Constructor)
    public void setCar(String man, String col, String bod)
    {
        manufacturer = man;
        colour = col;
        bodyType = bod;
    }

    // Object retrieval (get information from constructed object)
    public void getCar()
    {
        System.out.println("MANUFACTURER:\t" + manufacturer);
        System.out.println("COLOUR:\t\t\t" + colour);
        System.out.println("BODY TYPE:\t\t" + bodyType);
    }

}
