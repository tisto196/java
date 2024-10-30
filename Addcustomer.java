import java.io.*;

public class Addcustomer {

    public void addCustomer(int custId, String name, String accountNumber, double balance, String password) {
        // customer newCustomer = new customer(custId, name, balance, accountNumber,
        // password);

        try (FileWriter writer = new FileWriter("C:\\Users\\Tison101\\Desktop\\java\\out\\bank_db.txt", true)) {
            writer.write("\n" + custId + " " + name + " " + accountNumber + " " + balance + " " + password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public void addCustomer(int custId, String name, String accountNumber, double balance, String password,
            String append) {
        // customer newCustomer = new customer(custId, name, balance, accountNumber,
        // password);

        try (FileWriter writer = new FileWriter("C:\\Users\\Tison101\\Desktop\\java\\out\\bank_db.txt")) {
            writer.write(custId + " " + name + " " + accountNumber + " " + balance + " " + password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
