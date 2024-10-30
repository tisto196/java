import java.util.*;
import java.io.*;

public class LoadData {

    ArrayList<customer> customerList = new ArrayList<>();

    public void loadCustomerData() throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Tison101\\Desktop\\java\\out\\bank_db.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                int customerId = Integer.parseInt(data[0]);
                String accountnumber = data[2];
                String name = data[1];
                double balance = Double.parseDouble(data[3]);
                String password = data[4];

                customer Customer = new customer(customerId, name, balance, accountnumber, password);
                customerList.add(Customer);
            }

            // for (customer cs : customerList) {
            // System.out.println(cs.getCustomerID() + " " + cs.getName() + " " +
            // cs.getaccountNumber() + " "
            // + cs.getBalance() + " " + cs.getPassword());
            // }
        }

    }

    public ArrayList<customer> getcustomerList() {
        return customerList;
    }
}