package ontopic.week3;

public class Robot {
public int teamNumber;
    public String name = "Bobert";
    public int numMotors;
    //this is your class's constructor, this is for creating a new instance of the class
    //two constructors would be used for situations where different parameters go into a class
    public Robot (int teamNumber, String name, int numMotors) {
        //this. denotes that that variable is the parameter, not the global variable
        this.teamNumber = teamNumber;
        this.name = name;
        this.numMotors = numMotors;
    }
    public Robot (int teamNumber, String name) {
        this.teamNumber = teamNumber;
        this.name = name;
    }
    //static doesn't require you to make an instance
    public static void drive() {
        System.out.println("VROOOMMMM");
    }
    //these are the methods of your class, like r.getName()
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}
