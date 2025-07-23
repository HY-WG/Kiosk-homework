package challengeLv2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<MenuItem> items = new ArrayList<>();

    public void add(MenuItem selected) {
        items.add(selected);
    }
    //매개변수를 적어서 받아올수있음
//
    public void clear() {
        items.clear();
    }

    // 장바구니 비었을때
    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
       return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

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

