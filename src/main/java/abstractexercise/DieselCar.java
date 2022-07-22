package abstractexercise;

public class DieselCar extends Car {

    public void engine() {
        System.out.println("Diesel Engine");
    }

    @Override
    public void soundSystem() {
        System.out.println("Here we have worst sound system");
    }

}
