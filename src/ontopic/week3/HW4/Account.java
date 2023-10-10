package ontopic.week3.HW4;

public class Account {
    public String holderName;
    public int accountID;
    public Account (String holderName, int accountID) {
        this.holderName = holderName;
        this.accountID = accountID;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
