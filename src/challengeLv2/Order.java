package challengeLv2;

import java.util.Scanner;

public class Order {
    private final Cart cart;
    private UserType userType;

    public Order(Cart cart, UserType userType) {
        this.cart = cart;
        this.userType = userType;


    }

    public void selectUserType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("할인 유형을 선택하세요:");
        UserType.printUserTypes();



        while (true) {
            System.out.print("번호 입력: ");
            try {
                int code = Integer.parseInt(sc.nextLine());
                userType = UserType.fromCode(code);
                System.out.println(userType.getDescription() + "로 설정되었습니다.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }


    public double getTotalPriceWithDiscount() {
        double total = cart.getItems().stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();

        return total * (1 - userType.getDiscountRate());
    }

    public double getTotalPriceBeforeDiscount() {
        return cart.getItems().stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
    }

    public void printCartItems() {
        System.out.println("장바구니 목록:");
        cart.getItems().forEach(item ->
                System.out.println(item.getName() + " - " + item.getPrice() + "원")
        );

        System.out.println("총 합계 (할인 전): " + getTotalPriceBeforeDiscount() + "원");
        System.out.println("총 합계 (할인 후 - " + userType.getDescription() + "): " + getTotalPriceWithDiscount() + "원");
    }

    public void start() {
        if (cart.getItems().isEmpty()) {
            System.out.println("장바구니가 비어 있어 주문을 진행할 수 없습니다.");
            return;
        }
        selectUserType();

        System.out.println("\n[ 주문 요약 ]");
        printCartItems();


        Scanner sc = new Scanner(System.in);
        System.out.print("주문을 확정하시겠습니까? (Y/N): ");
        String confirm = sc.nextLine().trim();

        if (confirm.equalsIgnoreCase("Y")) {
            System.out.println("주문이 완료되었습니다. 감사합니다!");
            cart.clear();
            System.exit(0);
        } else {
            System.out.println("주문이 취소되었습니다.");
        }
    }
}
