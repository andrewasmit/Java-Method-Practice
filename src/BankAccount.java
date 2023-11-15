public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdraw(double amount){
        if(balance - amount >= 0){
            balance -= amount;
            System.out.println("Your account balance is now " + balance);
        } else {
            System.out.println("Insufficient funds. You only have a balance of " + balance);
        }
    };

    public void deposit(double amount){
        balance += amount;
        System.out.println("Your account balance is now " + balance);
    }
}

// fields for account #, balance, customer name, email, phone number
// create a getters and setter
// two methods; withdrawing and depositing
// cant withdraw if balance would be negative