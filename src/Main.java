//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Jamal",
                2000,
                "isa@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        Customer secCustomer = new Customer("Joe", "Billy");
        System.out.println(secCustomer.getName());
        System.out.println(secCustomer.getCreditLimit());
        System.out.println(secCustomer.getEmail());

        Customer thirdCustomer = new Customer("asd", 3333, "ASda@asd");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}