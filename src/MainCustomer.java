public class MainCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Andrew", 1000, "andrew@smit.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer newCustomer = new Customer();
        System.out.println(newCustomer.getName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmail());
    }
}
