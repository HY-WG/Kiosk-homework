package Lv4;

public class MenuItem {

    // 속성
    private String name;
    private double price;
    private String description;

    //생성
    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;

    }

    //기능
    void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("가격: " + this.price);
        System.out.println("메뉴 설명: " + this.description);

    }
// getter
    public String getName() {
        return name;
    }
}
