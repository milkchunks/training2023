package ontopic.week2;

public class Conditionals {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = x / y;
        if (x > z) {
            System.out.println(--x);
        } else {
            System.out.println("impossible");
        }
    }
}