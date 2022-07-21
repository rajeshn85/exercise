import human.Car;
import school.School;

public class Main {

    public static void main(String[] args){

        School anitaKumaran=new School(); //new object creation :: Syntax - [classname objectname=new classname() ]

        Car audi=new Car();

        audi.fuelType="petrol";
        audi.model="A4";


        anitaKumaran.name="Anita Kumaran Metriculation School";

        School tdta=new School();
        tdta.name="TDTA Hr. Sec. School";

        School maryannbest=new School();
        maryannbest.name="Mary Ann Best Hr. Sec. School";

        anitaKumaran.displayInformation();
        tdta.displayInformation();
        maryannbest.displayInformation();

    }
}
