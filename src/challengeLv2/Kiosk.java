package challengeLv2;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //속성자
    private final List<MenuItem> menuList;
    private final Cart cart;
    private final Scanner sc;
    private final Menu menu;
    private final Order order;
    private final UserType userType;

    //생성자
    public Kiosk(List<MenuItem> menuList, Cart cart, Scanner sc, Menu menu, Order order, UserType userType) {
        this.menuList = menuList;
        this.cart = cart;
        this.sc = sc;
        this.menu = menu;
        this.order = order;
        this.userType = userType;
    }

    // 매인 메뉴를 보여주는 첫 번째 메서드
    public void start() {
        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. BURGER");
            System.out.println("2. DRINK");
            System.out.println("3. DESSERT");
            System.out.println("0. 종료");
            System.out.print("메뉴 번호를 선택하세요: ");
            String input = sc.nextLine();


            switch (input) {
                case "1":
                    new Kiosk(menu.getMenu(Menu.MenuCategory.BURGER), cart, sc, menu, order, userType).startSubMenu();
                    break;
                case "2":
                    new Kiosk(menu.getMenu(Menu.MenuCategory.DRINK), cart, sc, menu, order, userType).startSubMenu();
                    break;
                case "3":
                    new Kiosk(menu.getMenu(Menu.MenuCategory.DESSERT), cart, sc, menu, order, userType).startSubMenu();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        }
    }
    // 하위 메뉴 (카테고리별 메뉴) 보여주는 두 번째 메서드
    public void startSubMenu() {
        while (true) {
            System.out.println("\n===== 메뉴 =====");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getName());
            }
            System.out.println("7. 장바구니 주문하기");
            System.out.println("8. 이전으로 돌아가기");
            System.out.println("9. 장바구니");
            System.out.println("0. 종료");


            System.out.print("메뉴 번호를 선택하세요: ");
            String input = sc.nextLine();

            int num;
            try {
                num = Integer.parseInt(input); // 문자열 입력을 숫자로 변환

            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue; // 다시 입력 받음
            }
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else if (num == 8) {
                break;
            } else if (num == 7) {
                new Order(cart, userType).start();
                break;
            } else if (num == 9) {
                cart.printCartItems();

            } else if (num >= 1 && num <= menuList.size()) {
                MenuItem selected = menuList.get(num - 1);
                selected.printInfo();
                new MenuApp(cart, selected, sc).start(); // 장바구니 메서드 MenuApp  시작
            } else {
                System.out.println("올바른 메뉴 번호를 입력해주세요.");
            }

        }
    }
}

