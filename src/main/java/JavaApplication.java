public class JavaApplication {

    public int id;
    public Integer _id;

    public boolean isStarted;
    public Boolean _isStarted;

    public String name; //Syntax [access modifier (private/protected/public/default)] [return data type] [attribute name]

    //Syntax [access modifier (private/protected/public/default)] [return data type] [method name](paramters...){}
    public static void main(String[] args) {
        int x;
        int y;
        y = 13;
        x = 13;
        //x = y;
        int z = x + y;
        int a = x % y;
        if (x < y) {
            System.out.println("x lesser than y");
        } else if (x > y) {
            System.out.println("x greater than y");
        } else {
            System.out.println("x equal to y");
        }

        //Mark 60 and above - first class
        if (x >= 60) {
            System.out.println("First Class");
        }
        //Mark below 60 and above or equal to 35 - second class
        if (x < 60 && x>=35) {
            System.out.println("Second Class");
        }
        //below 35 and not attended - failed
        if (x < 35) {
            System.out.println("Failed");
        }



        if (x >= 60) {
            System.out.println("First Class");
        } else if (x >= 35) {
            System.out.println("Second Class");
        } else {
            System.out.println("Failed");
        }


    }
}
