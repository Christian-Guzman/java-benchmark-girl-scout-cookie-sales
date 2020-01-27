package christian;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> cookies = new ArrayList<String>();
        boolean moreCookies = true;
        int totalBoxOfCookies = 0;
        System.out.println("--------------------------------------------------------------------");

        while (moreCookies == true) {
            System.out.println("Cookies Available (All for 5$): [1]Thanks-a-lot, [2]Girl-Scout-Smores, [3]Lemonades");
            System.out.print("Choose a #: ");
            String cookieName = in.nextLine();
            if (cookieName.equals("1")) {
                cookies.add("Thanks-a-lot");
            } else if (cookieName.equals("2")) {
                cookies.add("Girl-Scout-Smores");
            } else if (cookieName.equals("3")) {
                cookies.add("Lemonades");
            }

            System.out.print("Would you like to buy more boxes [Y]es or [N]o: ");
            String yesOrNo = in.nextLine().toLowerCase();
            if (yesOrNo.equals("y")) {
                moreCookies = true;

            } else {
                moreCookies = false;
            }
        }
        System.out.print("Last Name: ");
        String name = in.nextLine();
        System.out.print("Address: ");
        String address = in.nextLine();
        System.out.print("phone: ");
        String phone = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        Client reggie = new Client(name, address, phone, email);
        int cookieSize = cookies.size();
        cookieSize = cookieSize * totalBoxOfCookies;

        for (int i = 0; i < cookies.size(); i++) {
            System.out.print("How many boxes for " + cookies.get(i) + ": ");
            int boxAmount = in.nextInt();
            totalBoxOfCookies = totalBoxOfCookies + boxAmount;
        }
        System.out.println(reggie.getInfo());
        System.out.println("Your Total is: $" + totalBoxOfCookies * 5);
        in.close();
    }
}