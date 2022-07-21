package human;

public class Car {
    public String model;

    public String make;

    public String fuelType;

    public void display(){
        System.out.println("Car Model is " + this.model);
        System.out.println("Car Make is " + this.make);
        System.out.println("Car FuelType is " + this.fuelType);
    }
}
