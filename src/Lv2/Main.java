package Lv2;

import java.util.ArrayList; // 이거 잘 이해못함
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuList = new ArrayList<>(); // 리스트 선언 및 초기화 ?
        menuList.add(new MenuItem("ShackBurger",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        menuList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== 메뉴 =====");
            for (int i = 0; i < menuList.size(); i++) { // menuList 사이즈 만큼 i 증가시켜 반복해라 아마도
                System.out.println((i + 1) + ". " + menuList.get(i).name); // 번호를 순차적으로 증가시켜가며 class 내 name 과함께 출력
            }
            System.out.println("0. 종료"); // list에 없는 종료 문구 추가

            System.out.print("메뉴 번호를 선택하세요: ");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);


            if (num == 0) {
                System.out.println("프로그램을 종료합니다."); // 0이면 프로그램 종료
                break;
            } else if (num >= 1 && num <= menuList.size()) { //입력한 숫자가 1보다 크거나 메뉴 사이즈보다 작으면 메뉴 정보 출력
                System.out.println("\n선택한 메뉴 정보:");
                menuList.get(num - 1).printInfo();
            } else {
                System.out.println("올바른 메뉴 번호를 입력해주세요.");
            }
        }
    }
    }

