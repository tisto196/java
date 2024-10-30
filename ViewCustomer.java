import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ViewCustomer {

    public void viewcustomer(String name) throws FileNotFoundException, IOException {

        LoadData data = new LoadData();
        data.loadCustomerData();
        ArrayList<customer> Customer = data.getcustomerList();

        boolean found = false;

        for (customer cst : Customer) {
            System.out.println(cst.getName());
            if (cst.getName().equalsIgnoreCase(name)) {
                System.out.println("Customer ID: " + cst.getCustomerID());
                System.out.println("Name: " + cst.getName());
                System.out.println("Account Number: " + cst.getaccountNumber());
                System.out.println("Balance: " + cst.getBalance());
                System.out.println("Password: " + cst.getPassword());
                System.out.println("-----------------------------");
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Customer with the Name:" + name + " not found on data file");
        }
    }
}