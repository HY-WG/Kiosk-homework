package challengeLv1;

import java.util.List;
import java.util.Scanner;

public class MenuApp {

    private final Menu menu = new Menu();
    private final Cart cart = new Cart();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            MenuItem selected = Kiosk.num(name);
            System.out.println("\n선택한 메뉴: " + selected.getName());
            System.out.println(selected.getDescription() + " | 가격: W " + selected.getPrice());

            System.out.println("\n해당 메뉴를 장바구니에 추가할까요?");
            System.out.println("1. 네    2. 아니오");

            String addChoice = scanner.nextLine();
            if (addChoice.equals("1")) {
                cart.add(selected);
                System.out.println(selected.getName() + "가 장바구니에 추가되었습니다!");
                System.out.println(selected.getName() + "0.메뉴로 돌아가기");
                    } else {
                        System.out.println("장바구니에 추가하지 않았습니다.");
                System.out.println(selected.getName() + "0.메뉴로 돌아가기");
                String fc = scanner.nextLine();
                if (fc.equals("0")){
                    Kiosk kiosk = new Kiosk();
                    Kiosk.start();

                    break;
                }
                    }
                }
            }
        }