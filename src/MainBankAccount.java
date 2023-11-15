public class MainBankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);
        account.withdraw(50);
        account.withdraw(51);

    }
}

