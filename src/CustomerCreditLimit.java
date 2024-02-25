public class CustomerCreditLimit {
    private String customerName;
    private double creditLimit;
    private String email;

    public CustomerCreditLimit(){
        this("Unknown", "");
    }

    public CustomerCreditLimit(String customerName, String email){
        this("Unknown", 0.00,email);
    }
    public CustomerCreditLimit(String customerName, double creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
