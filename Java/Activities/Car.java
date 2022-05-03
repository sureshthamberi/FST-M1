package Activities;

public class Car {
    // class member variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //constructor
    Car() {
        tyres = 4;
        doors = 4;
    }

//class methods

    public void displaycharacterstics()
    {

        System.out.println("Color of the car is :"+ color);
        System.out.println(" Make of the car is :" + make);
        System.out.println("transmission of the car is :" + transmission);
        System.out.println("nummber of the doors on car:" + doors);
        System.out.println("number of the tyres on car:" + tyres);
    }
    public void accelerate ()
    {
        System.out.println("Car is moving forward");
    }
    public void brake()
    {
        System.out.println("Car has stopped");
    }
public void dummy() {}
}


