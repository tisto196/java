import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class UpdateCustomer {

    public void updateCustomer(int id, String name, String password, double amount)
            throws FileNotFoundException, IOException {

        LoadData load = new LoadData();
        Addcustomer add = new Addcustomer();
        int index = 1;
        load.loadCustomerData();
        ArrayList<customer> updatedata = load.getcustomerList();

        if (password == null && amount == 0) {
            for (customer cst : updatedata) {
                if (cst.getCustomerID() == id) {
                    if (!name.equals(null) && !name.isEmpty()) {
                        cst.setName(name);
                    }
                }
                if (index == 1) {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(), cst.getBalance(),
                            cst.getPassword(), "update");
                    index++;
                } else {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(), cst.getBalance(),
                            cst.getPassword());
                }

            }

        }
        if (name == null && amount == 0) {
            for (customer cst : updatedata) {
                if (cst.getCustomerID() == id) {
                    if (!password.equals(null) && !password.isEmpty()) {
                        cst.setPassword(password);
                    }
                }
                if (index == 1) {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(), cst.getBalance(),
                            cst.getPassword(), "update");
                    index++;
                } else {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(), cst.getBalance(),
                            cst.getPassword());
                }

            }
        }
        if (name == null && amount >= 0) {
            for (customer cst : updatedata) {

                if (cst.getCustomerID() == id) {
                    if (password.equals("Deposit")) {
                        double balance = cst.getBalance() + amount;

                        if (balance >= 0) {
                            cst.setBalance(balance);

                        }

                    } else {
                        double balance = cst.getBalance() - amount;

                        if (balance >= 0) {
                            cst.setBalance(balance);

                        }

                    }

                }
                if (index == 1) {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(),
                            cst.getBalance(),
                            cst.getPassword(), "update");
                    index++;
                } else {
                    add.addCustomer(cst.getCustomerID(), cst.getName(), cst.getaccountNumber(),
                            cst.getBalance(),
                            cst.getPassword());
                }

            }
        }
    }
}