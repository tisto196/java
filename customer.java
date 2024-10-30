
public class customer {

    int customerId;
    String name;
    double balance;
    String accountNumber;
    String password;

    public customer(int customerId, String name, double balance, String accountNumber, String password) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.password = password;

    }

    public int getCustomerID() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public int setCustomerID() {
        return customerId;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public void setBalance(double balance2) {
        this.balance = balance2;
    }

    public void setPassword(String password2) {
        this.password = password2;
    }

    public String setaccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return customerId + " " + name + " " + balance + " " + password + " " + accountNumber;
    }
}