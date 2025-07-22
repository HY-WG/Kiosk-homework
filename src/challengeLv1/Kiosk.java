package challengeLv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Kiosk {

        List<MenuItem> menuList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Kiosk(List<MenuItem> menuList) {
            this.menuList.addAll(menuList);
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n===== 메뉴 =====");
                for (int i = 0; i < menuList.size(); i++) { // menuList 사이즈 만큼 i 증가시켜 반복
                    System.out.println((i + 1) + ". " + menuList.get(i).getName()); // 번호를 순차적으로 증가시켜가며 class 내 name 과함께 출력
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
                    MenuApp menuApp = new MenuApp();
                    menuApp.start();
                    break;
                } else {
                    System.out.println("올바른 메뉴 번호를 입력해주세요.");
                }

            }
        }

    }

