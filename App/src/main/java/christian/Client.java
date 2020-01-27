package christian;

public class Client {
    String lastName;
    String address;
    String phone;
    String email;
    String cookieBox;

    public Client(String lastName, String address, String phone, String email, String cookieBox) {
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.cookieBox = cookieBox;
    }

    public String getReceipt() {
        return lastName + " ordered 1 box of " + cookieBox + ". " + "To: " + address + ". " + "Contact Info: " + phone
                + "; " + email;
    }

}
