package christian;

import java.util.Scanner;

public class Buyer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Cookies Available (All for 5$): [1]Thanks-a-lot, [2]Girl-Scout-Smores, [3]Lemonades");
        System.out.print("Choose a #: ");
        String cookieName = in.nextLine();
        if (cookieName.equals("1")) {
            cookieName = "Thanks-a-lot";
        } else if (cookieName.equals("2")) {
            cookieName = "Girl-Scout-Smores";
        } else if (cookieName.equals("3")) {
            cookieName = "Lemonades";
        }
        System.out.print("Last Name: ");
        String name = in.nextLine();
        System.out.print("Address: ");
        String address = in.nextLine();
        System.out.print("phone: ");
        String phone = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("How many Boxes: ");
        int boxAmount = in.nextInt();
        Client reggie = new Client(name, address, phone, email, cookieName);
        System.out.println(reggie.getReceipt());
        System.out.println("Total: $" + boxAmount * 5);
        in.close();
    }
}