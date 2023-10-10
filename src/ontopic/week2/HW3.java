package ontopic.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your equation");
        String equation = scanner.next();

        ArrayList equationArray = new ArrayList();
        Pattern digits = Pattern.compile("(\\d\\d?\\d?\\d?)|\\(|\\)|\\+|-|\\*|/");
        Matcher digitsMatcher = digits.matcher(equation);
        while (digitsMatcher.find()) {
            equationArray.add(digitsMatcher.group());
        }

        String operator = equationArray.get(1).toString();
        double num1 = Double.parseDouble(equationArray.get(0).toString());
        double num2 = Double.parseDouble(equationArray.get(2).toString());
        switch (operator) {
            case "+":
                System.out.println(add(num1, num2));
                break;
            case "-":
                System.out.println(subtract(num1, num2));
                break;
            case "*":
                System.out.println(multiply(num1, num2));
                break;
            case "/":
                System.out.println(divide(num1, num2));
                break;
            default:
                System.out.println("Error: Bad operator");
        }
    }
    public static double add(double x, double y) {return x + y;}
    public static double subtract(double x, double y) {return x - y;}
    public static double multiply(double x, double y) {return x * y;}
    public static double divide(double x, double y) {return x / y;}
}