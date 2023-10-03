package ontopic.week1;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Trapezoid area: " + trapezoid(16, 7, 8));
        System.out.println("There are " + secondsToMinutesAndSeconds(1678)[0] + " minutes and " + secondsToMinutesAndSeconds(1678)[1] + " seconds in 1678 seconds");
        System.out.println("x-int: " + xintYint(2, 4)[0] + ", y-int: " + xintYint(2, 4)[1]);
        System.out.println("Zeroes: " + quadraticFormula(3, 8, 4)[0] + ", " + quadraticFormula(3, 8, 4)[1]);
    }
    //returns area
    public static double trapezoid(double a, double b, double h) {
        return ((a + b) / 2) * h;
    }
    //returns {minutes, seconds}
    public static double[] secondsToMinutesAndSeconds(double seconds) {
        return new double[] {Math.floor(seconds / 60), seconds % 60};
    }
    //returns {x int, y int}
    public static double[] xintYint(double m, double b) {
        return new double[] {(0 - b) / m, b};
    }
    //returns {zero1, zero2}
    public static double[] quadraticFormula(double a, double b, double c) {
        double sqrtPortion = Math.sqrt(Math.pow(b, 2) - (4*a*c));
        return new double[] {(-b + sqrtPortion) / (2 * a), (-b - sqrtPortion) / (2 * a)};
    }
}