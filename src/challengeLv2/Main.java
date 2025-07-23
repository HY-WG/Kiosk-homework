package challengeLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Menu menu = new Menu();
        menu.loadData();

        Kiosk kiosk = new Kiosk(new ArrayList<>(), cart, scanner, menu);
        kiosk.start();

    }
}