package ontopic.week3.HW4;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Account> accounts;
    public Bank (ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public void addAccount(String holderName, int accountID, double balance) {
        this.accounts.add(new Account(holderName, accountID, balance));
    }

    /**
     * @param accountID the ID of the account to be deleted
     */
    public void removeAccount(int accountID) {
        for (int i = 0; i <= accounts.size(); i++) {
            if (accountID == accounts.get(i).getAccountID()) {
                accounts.remove(i);
            }
        }
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
