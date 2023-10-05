package ontopic.week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String equation = scanner.next();
        String equation = "3+3";
        String[] splitEquation = equation.split("(\\* | - | \\+ | /)");
        //equation.split("\\* | \\- | \\+ | \\/");
        System.out.println(Arrays.toString(splitEquation));
    }
}