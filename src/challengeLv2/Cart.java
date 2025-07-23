package challengeLv2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 장바구니에 담긴 메뉴 항목들 저장
    private final List<MenuItem> items = new ArrayList<>();

    // 장바구니에 메뉴 하나 추가
    public void add(MenuItem selected) {
        items.add(selected);
    }

    // 장바구니가 비었는지 확인
    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }

    // 장바구니 항목 전체 반환
    public List<MenuItem> getItems() {
        return items;
    }

    // 장바구니에 담긴 메뉴들의 총 가격 계산
    public double getTotalPrice() {
        double total = 0.0; // 총 가격을 저장할 변수 total을 0.0으로 초기화
        for (MenuItem item : items) { // items라는 리스트에서 MenuItem 객체를 하나씩 꺼내서 item이라고 부르면서 반복
            total += item.getPrice(); // MenuItem의 price 속성을 꺼내서 누적합 (+) 계산
        }
        return total; //총 가격 반환
    }

    // 장바구니 항목 출력
    public void printCartItems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        }
        System.out.println("장바구니 목록:");
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - " + item.getPrice() + "원");
        }
        System.out.println("총 합계: " + getTotalPrice() + "원");
    }
}

