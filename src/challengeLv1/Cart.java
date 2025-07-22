package challengeLv1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<MenuItem> items = new ArrayList<>();

    public void add(MenuItem item) {
        items.add(item);
    }
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
}
