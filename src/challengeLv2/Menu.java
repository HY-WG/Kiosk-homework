package challengeLv2;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public enum MenuCategory {
        BURGER, DRINK, DESSERT
    }

    private final List<MenuItem> burgers = new ArrayList<>();
    private final List<MenuItem> drinks = new ArrayList<>();
    private final List<MenuItem> desserts = new ArrayList<>();

    public List<MenuItem> getMenu(MenuCategory category) {
        // 각 카테고리별 메뉴를 담을 리스트
        return switch (category) {
            case BURGER -> burgers;
            case DRINK -> drinks;
            case DESSERT -> desserts;


        };
    }
// 카테고리에 따라 해당 리스트를 반환
    public void loadData() {
        addMenu(MenuCategory.BURGER, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        addMenu(MenuCategory.BURGER, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        addMenu(MenuCategory.BURGER, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        addMenu(MenuCategory.BURGER, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        addMenu(MenuCategory.DRINK, "제로 코카콜라", 3.0, "시원한 콜라");
        addMenu(MenuCategory.DRINK, "코카콜라", 3.0, "클래식한 콜라");
        addMenu(MenuCategory.DRINK, "마운틴듀", 3.0, "차원이 다른 사이다");
        addMenu(MenuCategory.DRINK, "사이다", 3.0, "따뜻한 사이다");
        addMenu(MenuCategory.DESSERT, "콘아이스크림", 3.0, "시원한 아이스크림");
        addMenu(MenuCategory.DESSERT, "소프트 아이스크림", 3.0, "부드러운 아이스크림");
        addMenu(MenuCategory.DESSERT, "웨지감자", 3.0, "맛있는 감자튀김");
        addMenu(MenuCategory.DESSERT, "양념 웨지 감자", 3.0, "톡쏘는 양념을 얹은 감자튀김");
    }

    public void addMenu(MenuCategory category, String name, double price, String description) {
        getMenu(category).add(new MenuItem(name, price, description));


    }
}
