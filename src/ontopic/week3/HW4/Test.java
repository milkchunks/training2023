package ontopic.week3.HW4;

import java.util.Arrays;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Account jeffAccount = new Account("Jeff", 0, 0);
        Account carlaAccount = new Account("Carla", 1, 100);
        ArrayList<Account> accList = new ArrayList<>(Arrays.asList(jeffAccount, carlaAccount));
        Bank bank = new Bank(accList);
        bank.addAccount(new Account("Xander", 0, 20000));
        String items = "";
        for (int i=0;i<=bank.getAccounts().size() - 1;i++) {
            items += bank.getAccounts().get(i).getBalance();
        }
        System.out.println(items);
    }
}
