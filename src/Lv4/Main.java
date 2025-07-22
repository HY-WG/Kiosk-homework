package Lv4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. BURGER");
        System.out.println("2. DRINK");
        System.out.println("3. DESSERT");
        System.out.println("0. 종료");
        System.out.print("메뉴 번호를 선택하세요: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        Menu menu = new Menu();       // 메뉴 객체 생성

        switch (input) {
            case "1":
                menu.loadData();  // 메뉴 리스트 전달
                List<MenuItem> burgerList = menu.getMenu(Menu.MenuCategory.BURGER);
                Kiosk kiosk = new Kiosk(burgerList);
                kiosk.start();
                // 키오스크 실행  // 키오스크 실행

            case "2":
                menu.loadData();  // 메뉴 리스트 전달
                List<MenuItem> drinkList = menu.getMenu(Menu.MenuCategory.DRINK);
                Kiosk kiosk2 = new Kiosk(drinkList);
                kiosk2.start();

            case "3":
                menu.loadData();  // 메뉴 리스트 전달
                List<MenuItem> dessertList = menu.getMenu(Menu.MenuCategory.DESSERT);
                Kiosk kiosk3 = new Kiosk(dessertList);
                kiosk3.start();

                break;
        }
    }
}
