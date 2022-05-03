package Activities;

public class Activity1 {
    public static void main(String[] args) {


        Car toyota = new Car();
        toyota.color = "Black";
        toyota.make = 2014;
        toyota.transmission = "Manual";

        //Using Car class method

        toyota.displaycharacterstics();
        toyota.accelerate();
        toyota.brake();
        toyota.dummy();
    }
}
