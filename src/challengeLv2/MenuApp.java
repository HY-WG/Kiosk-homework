package challengeLv2;

import java.util.Scanner;

public class MenuApp {

    //생성자
    private final MenuItem selected;
    private final Cart cart;
    private final Scanner scanner;

    //장바구니 보기 전용 생성자
    public MenuApp(Cart cart, MenuItem selected, Scanner scanner) {
        this.cart = cart;
        this.selected = selected;
        this.scanner = scanner;
        // kiosk 에서 만든 Cart 를 받아오기
    }

    public void start() {
        System.out.println("\n선택한 메뉴: " + selected.getName());
        System.out.println(selected.getDescription() + " | 가격: W " + selected.getPrice());

        while (true) {
            System.out.println("\n해당 메뉴를 장바구니에 추가할까요?");
            System.out.println("1. 네    2. 아니오");
            String addChoice = scanner.nextLine();

            if ("1".equals(addChoice)) {
                cart.add(selected);
                System.out.println(selected.getName() + "가 장바구니에 추가되었습니다!");
                break;
            } else if ("2".equals(addChoice)) {
                System.out.println("장바구니에 추가하지 않았습니다.");
                break;
            } else {
                System.out.println("1 또는 2를 입력해주세요.");
            }
        }
    }
}
