import abstractexercise.AppleElectricCar;
import human.Car;
import school.School;

public class AbstractApplication {

    public static void main(String[] args) {
        AppleElectricCar car = new AppleElectricCar();
        car.soundSystem();
        car.window();
        car.engine();
        car.make();
    }
}
