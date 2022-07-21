package school;

import java.util.Date;

public class School {

    public String name;

    public String address;

    public Integer startedYear;

    public String founderName;

    public String type;

    public void displayInformation(){
        System.out.println("School name : " + name); //example for over loading System.out.println(10 + 5);
        System.out.println("School address : " + address);
        System.out.println("School startedYear : " + startedYear);
        System.out.println("School founderName : " + founderName);
        System.out.println("School type : " + type);
    }
}
