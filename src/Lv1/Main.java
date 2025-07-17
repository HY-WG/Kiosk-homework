package Lv1;

import java.util.Scanner; //자바유틸 (package 다음에 와야함)


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner  객체

        while (true) { //  while(true) 로 break 지점 전까지 계속 반복
            System.out.println("메뉴를 골라주세요.");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 메뉴 고르기를 종료합니다.");

            System.out.println("메뉴 번호를 입력하세요. :");
            String input = in.nextLine();; // 반복 출력문 + 입력스캐너

            if (input.equals("0")) { // 종료 조건문
                System.out.println("메뉴 선택을 종료합니다."); // 조건 충족시 출력문
                break; // 조건문 끝
            }

            System.out.println("선택하신 메뉴는 " + input + " 번 입니다.\n"); // 조건 외 입력시 출력

        }


    }
}
