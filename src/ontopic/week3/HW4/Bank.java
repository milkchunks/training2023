package ontopic.week3.HW4;

import java.util.List;

public class Bank {
    public double balance;
    public List<Account> accounts;
    public Bank (List<Account> accounts, double balance) {
        this.accounts = accounts;
        this.balance = balance;
    }
    public void addAccount(String holderName, int accountID) {
        this.accounts.add(new Account(holderName, accountID));
    }
    public void removeAccount(int accountID) {
        System.out.println("Input the account ID of the account to delete");
        for (int i;i<=)
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
