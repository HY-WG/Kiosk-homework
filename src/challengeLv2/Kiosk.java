package challengeLv2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Kiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Menu menu = new Menu();
        menu.loadData();

    }

    //속성자
    private final List<MenuItem> menuList;
    private final Cart cart;
    private final Scanner sc;
    private final Menu menu;



    //생성자
    public Kiosk(List<MenuItem> menuList, Cart cart, Scanner sc, Menu menu) {
        this.menuList = menuList;
        this.cart = cart;
        this.sc = sc;
        this.menu = menu;
    }

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
                        new Kiosk(menu.getMenu(Menu.MenuCategory.BURGER), cart, sc, menu).startSubMenu();
                        break;
                    case "2":
                        new Kiosk(menu.getMenu(Menu.MenuCategory.DRINK), cart, sc, menu).startSubMenu();
                        break;
                    case "3":
                        new Kiosk(menu.getMenu(Menu.MenuCategory.DESSERT), cart, sc, menu).startSubMenu();
                        break;
                    case "0":
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("올바른 메뉴 번호를 입력하세요.");
                }
            }
        }

        public void startSubMenu() {
            while (true) {
                System.out.println("\n===== 메뉴 =====");
                IntStream.range(0, menuList.size()) // 메뉴 리스트 출력 최적화 (람다 + forEach)
                        .forEach(i -> {
                            MenuItem item = menuList.get(i);
                            System.out.println((i + 1) + ". " + item.getName());
                        });
                System.out.println("0. 종료");
                System.out.println("8. 이전으로 돌아가기");
                System.out.println("9. 장바구니");

                System.out.print("메뉴 번호를 선택하세요: ");
                String input = sc.nextLine();

                int num;
                try {
                    num = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }
                if (num == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                } else if (num == 8) {
                    break;
                } else if (num == 9) {
                    cart.printCartItems();

                } else if (num >= 1 && num <= menuList.size()) {
                    MenuItem selected = menuList.get(num - 1);
                    selected.printInfo();
                    new MenuApp(cart, selected, sc).start();
                } else {
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
                }
                }

            }
        }

