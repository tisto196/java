import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MoneyManagemnt {

    public void manage(int id, double amount) throws FileNotFoundException, IOException {

        LoadData data = new LoadData();
        data.loadCustomerData();
        ArrayList<customer> Customer = data.getcustomerList();
        UpdateCustomer updt = new UpdateCustomer();

        for (customer cst : Customer) {
            if (id == cst.getCustomerID()) {
                double balance = cst.getBalance();
                if (balance >= amount) {
                    balance = balance - amount;
                    updt.updateCustomer(id, null, null, balance);

                }

            }
        }

    }

}
