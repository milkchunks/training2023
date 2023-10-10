package ontopic.week3.HW4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person anne = new Person("Anne", 13);
        Person carl = new Person("Carl", 90);
        System.out.println("Name: " + anne.getName() + ", Age: " + anne.getAge());
        System.out.println("Name: " + carl.getName() + ", Age: " + carl.getAge() + "\n");

        Rectangle rectangle = new Rectangle(20, 30);
        System.out.println("Perimeter: " + rectangle.getPerimeter() + ", Area: " + rectangle.getArea() + "\n");

        ArrayList<Account> accs = new ArrayList<>();
        accs.add(new Account("James", 981042));
        Bank bankAccount = new Bank(new ArrayList<Account>(
                Arrays.asList(
                        new Account("James", 981042))), 0);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);
        System.out.println("Balance: " + bankAccount.getBalance());
    }
}
