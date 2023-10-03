package ontopic.week1;

import java.util.Scanner;
public class Trapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which value would you like to calculate? (a/b/h)");
        String choice = scanner.next();
        switch (choice) {
            case "a": {
                System.out.println("Input area");
                double area = scanner.nextDouble();
                System.out.println("Input 'b' value");
                double b = scanner.nextDouble();
                System.out.println("Input height");
                double height = scanner.nextDouble();
                System.out.println(findAValue(area, b, height));
            }
            case "b": {
                System.out.println("Input area");
                double area = scanner.nextDouble();
                System.out.println("Input 'a' value");
                double a = scanner.nextDouble();
                System.out.println("Input height");
                double height = scanner.nextDouble();
                System.out.println(findBValue(area, a, height));
            }
            case "h": {
                System.out.println("Input area");
                double area = scanner.nextDouble();
                System.out.println("Input 'a' value");
                double a = scanner.nextDouble();
                System.out.println("Input 'b' value");
                double b = scanner.nextDouble();
                System.out.println(findHeight(area, a, b));
            }
        }
        scanner.close();
    }
    public static double findAValue(double area, double b, double height) {
        return 2 * (area - height) - b;
    }
    public static double findBValue(double area, double a, double height) {
        return 2 * (area - height) - a;
    }
    public static double findHeight(double area, double a, double b) {
        return 2 * (area / (a + b));
    }
}
