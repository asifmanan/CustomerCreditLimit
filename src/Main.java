public class Main {
    public static void main(String[] args) {
        CustomerCreditLimit customer = new CustomerCreditLimit();
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());
        System.out.println("-".repeat(30));
        CustomerCreditLimit customer2 = new CustomerCreditLimit("Asif M.", "asifm@email.com");
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getEmail());
        System.out.println(customer2.getCreditLimit());
        System.out.println("-".repeat(30));
        CustomerCreditLimit customer3 = new CustomerCreditLimit("Asif M.", 50000d, "asifm@email.com");
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getEmail());
        System.out.println(customer3.getCreditLimit());
    }
}
