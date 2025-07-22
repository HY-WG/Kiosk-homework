package Lv4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();       // 메뉴 객체 생성
        menu.loadData();              // 메뉴 데이터 로딩
        List<MenuItem> burgerList = menu.getMenu(Menu.MenuCategory.BURGER);  // 원하는 카테고리 선택

        Kiosk kiosk = new Kiosk(burgerList);  // 메뉴 리스트 전달
        kiosk.start();  // 키오스크 실행
    }
}
