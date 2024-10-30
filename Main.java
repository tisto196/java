import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("-------------------welcome to Bank system made by the useless one------------------");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("1. Add a new customer");
            System.out.println("2. View all details");
            System.out.println("3. View particular customer details");
            System.out.println("4. Update customer details");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Deposit Money");
            System.out.println("0. Type 0 to exist the system");

            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out
                            .println("------------------------------------AddCustomer-----------------------");
                    System.out.println("Enter the customer name");
                    String name = scanner.nextLine();
                    System.out.println("Enter the customerID");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the customer accountNumber");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter the customer's balance");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the customer's password");
                    String password = scanner.nextLine();

                    Addcustomer newCustomer = new Addcustomer();

                    newCustomer.addCustomer(customerId, name, accountNumber, balance, password);
                    System.out.println("------------------------------------########-----------------------");

                    break;
                case "2":
                    ViewAllCutomers viewAll = new ViewAllCutomers();

                    try {
                        System.out
                                .println("------------------------------------Customer details-----------------------");

                        viewAll.viewAllCustomers();
                        System.out.println("------------------------------------########-----------------------");
                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                    break;
                case "3":
                    System.out.println(
                            "------------------------------------View particular customer details-----------------------");
                    ViewCustomer cust = new ViewCustomer();
                    System.out.println("Please enter the customer's name to search for details: ");
                    String customerName = scanner.nextLine();
                    cust.viewcustomer(customerName);

                    System.out.println(
                            "------------------------------------------#######-------------------------------------------");
                    break;
                case "4":
                    System.out.println(
                            "-------------------------------------Update Form--------------------------------------");
                    UpdateCustomer update = new UpdateCustomer();
                    System.out.println("1. Name update  ");
                    System.out.println("2. password Change");
                    String option1 = scanner.nextLine();
                    System.out.println("Enter the customer's ID to update");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (option1.equals("1")) {
                        System.out.println("Enter your new name");
                        String newName = scanner.nextLine();
                        update.updateCustomer(id, newName, null, 0);
                    }
                    if (option1.equals("2")) {
                        System.out.println("Enter your new password");
                        String newPassword = scanner.nextLine();
                        update.updateCustomer(id, null, newPassword, 0);
                    }

                    break;
                case "5":
                    System.out.println("----------------------------------Money withdraw----------------------");
                    System.out.println("Enter the customer's ID to withdraw money");
                    int WId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the amount to withdraw");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    UpdateCustomer moneymanage = new UpdateCustomer();
                    moneymanage.updateCustomer(WId, null, "Withdraw", amount);

                    break;
                case "6":
                    System.out.println("----------------------------------Money deposit----------------------");
                    System.out.println("Enter the Customers ID to Deposite money");
                    int DId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the amount to deposit");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    UpdateCustomer Dmanage = new UpdateCustomer();
                    Dmanage.updateCustomer(DId, null, "Deposit", deposit);

                    break;
                case "0":
                    System.out.println("Thankyou for banking with us");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (!option.equals("0"));

        scanner.close();

        // ArrayList<customer> cutomerlist = new ArrayList<>();
        // try (BufferedReader reader = new BufferedReader(
        // new FileReader("C:\\Users\\Tison101\\Desktop\\java\\out\\bank_db.txt"))) {
        // String Line;
        // while ((Line = reader.readLine()) != null) {
        // String[] data = Line.split(" ");
        // int customerId = Integer.parseInt(data[0]);
        // String name = data[1];
        // String accountnumber = data[2];
        // double balance = Double.parseDouble(data[3]);
        // String password = data[4];

        // customer Customer = new customer(customerId, name, balance, accountnumber,
        // password);
        // cutomerlist.add(Customer);
        // }
        // System.out.println("dataloaded successfully");
        // for (customer cust : cutomerlist) {
        // System.out.println(cust.getCustomerID());
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }
}