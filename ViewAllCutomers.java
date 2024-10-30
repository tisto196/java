public class ViewAllCutomers {

    LoadData loadData = new LoadData();

    public void viewAllCustomers() {
        try {
            loadData.loadCustomerData();
            for (customer cs : loadData.getcustomerList()) {
                System.out.println(cs.getCustomerID() + " " + cs.getName() + " " +
                        cs.getaccountNumber() + " "
                        + cs.getBalance() + " " + cs.getPassword());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
