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
        System.out.println("Perimeter: " + rectangle.getPerimeter() + ", Area: " + rectangle.getArea());
        Rectangle rectangle1 = new Rectangle(40, 60);
        System.out.println("Perimeter: " + rectangle1.getPerimeter() + ", Area: " + rectangle1.getArea() + "\n");

        Account jeffAccount = new Account("Jeff", 0, 0);
        Account carlaAccount = new Account("Carla", 1, 100);
        Bank bank = new Bank(new ArrayList<>(Arrays.asList(jeffAccount, carlaAccount)));
        bank.addAccount(new Account("Xander", 2, 10000));
        bank.removeAccount(jeffAccount);
        String items = "Holder Name: ";
        for (int i=0;i<=bank.getAccounts().size()-1;i++) {
            items += bank.getAccounts().get(i).getHolderName();
            items += " , Account ID: " + bank.getAccounts().get(i).getAccountID();
            items += " , Balance: " + bank.getAccounts().get(i).getBalance();
            System.out.println(items);
            items = "Holder Name: ";
        }
    }
}
