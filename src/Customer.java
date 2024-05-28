import javax.swing.plaf.PanelUI;

public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(){
        this("Jimmy", "J@gmail.com");
    }

    public Customer(String name, String email){
        this("Jimmy", 200, "email@email.com");
    }

    public Customer (String name, int creditLimit, String email ) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }





    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


}
