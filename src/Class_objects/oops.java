package Class_objects;

class pen{
    //property
    String color;
    String type;

    //methods - functions are in a class

    public void write()
    {
        System.out.println("Writting somethong");
    }

}

public class oops {

    public static void main(String [] args)
    {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
    }
}
