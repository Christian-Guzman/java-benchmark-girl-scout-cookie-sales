package christian;

public class Client {
    String lastName;
    String address;
    String phone;
    String email;

    public Client(String lastName, String address, String phone, String email) {
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo() {
        return "Contact: " + this.phone + ", " + this.email + ", " + this.address;
    }

}
