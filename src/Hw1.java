public class Hw1 {
    public static void main(String[] args) {
        double a = 16;
        //trapezoid base
        double b = 7;
        double h = 8;
        System.out.println("Trapezoid area = " + ((a + b) / 2) * h);
        System.out.println("There are " + Math.floor(1678 / 60) + " minutes and " + 1678 % 60 + " seconds in 1678 seconds");
        double m = 2;
        //b value in y = mx+b
        double b2 = 4;
        //(y-b)/m = x, xint is when y = 0
        System.out.println("y-int = " + b2 + ", x-int = " + (0 - b2) / m);
        //TODO use quadratic equation to find zeroes
        double qa = 3;
        double qb = 8;
        double qc = 4;
        double zero1 = (-qb + Math.sqrt(Math.pow(qb, 2) - (4*qa*qc))) / (2 * qa);
        double zero2 = (-qb - Math.sqrt(Math.pow(qb, 2) - (4*qa*qc))) / (2 * qa);
        System.out.println("Zeroes: " + zero1 + ", " + zero2);
    }
}
