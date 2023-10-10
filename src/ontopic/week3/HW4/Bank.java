package ontopic.week3.HW4;

import java.util.List;

public class Bank {
    public double balance;
    public List<Account> accounts;
    public Bank (List<Account> accounts, double balance) {
        this.accounts = accounts;
        this.balance = balance;
    }
    public void newAccount(String holderName, int accountID) {

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
