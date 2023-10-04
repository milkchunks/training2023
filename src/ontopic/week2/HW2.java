package ontopic.week2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a number");
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        scanner.close();
        }
        {
            int a = (int) (Math.random() * (100 - 0) - 0);
            int b = (int) (Math.random() * (100 - 0) - 0);
            int c = (int) (Math.random() * (100 - 0) - 0);
            if (a > b && a > c) {
                System.out.println("a is greatest");
            } else if (b > a && b > c) {
                System.out.println("b is greatest");
            } else if (c > a && c > b) {
                System.out.println("c is greatest");
            }
        }
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your grade");
            int answer = scanner.nextInt();
            if (answer > 90) {
                System.out.println("A");
            } else if (answer > 80) {
                System.out.println("B");
            } else if (answer > 70) {
                System.out.println("C");
            } else if (answer > 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            scanner.close();
        }
    }
}
