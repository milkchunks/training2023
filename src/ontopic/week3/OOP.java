package ontopic.week3;

public class OOP {
    public static void main(String[] args) {
        Robot robot1 = new Robot(1000, "gertrude", 4);
        Robot robot2 = new Robot(2000, "clarence");
        //renaming robot2
        robot2.name = "gertrude jr.";
    }
}