package Class_objects;

class pen{
    //property
    String color;
    String type;

    //methods - functions are in a class

//    public void write()
//    {
//        System.out.println("Writting somethong");
//    }
//
//    public void printcolor()
//    {
//        System.out.println(this.color);
//    }


    /// polymorphism
    public void printINfo(String name)
    {
        System.out.println(name);
    }
    public void printINfo(int age)
    {
        System.out.println(age);
    }
    public void printINfo(String name, int age)
    {
        System.out.println(name);
    }


}

class student
{

    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age );
    }
}

public class oops {

    public static void main(String [] args)
    {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

    }
}
