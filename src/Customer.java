public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }

    public Customer(){
        this("Nobody", "nobody@nowhere.com");
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }
}

// 3 fields; name credit limit and email

//getter methods only  (No setters)

// 3 constructors for the class
// 1. a constructor with all 3 fields and directly assigns
// 2. a no args constructor that calls another construct passing literals values for each
// 3. just the name and email which also calls the constructor