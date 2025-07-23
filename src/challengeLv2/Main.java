package challengeLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //프로그램을 시작하기 위해 주요객체들을 미리 생성함
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Menu menu = new Menu();
        UserType userType = UserType.NONE; ;
        Order order = new Order(cart, userType);
        menu.loadData(); // 메뉴에 음식 데이터(버거, 음료, 디저트)를 미리 불러옴.

        // 키오스크 클래스의 start 매서드를 실행.
        Kiosk kiosk = new Kiosk(new ArrayList<>(), cart, scanner, menu, order, userType);
        kiosk.start();


    }
}