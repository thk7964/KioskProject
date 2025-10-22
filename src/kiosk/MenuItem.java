package kiosk;

public class MenuItem {
    //속성
    private final String name;// 메뉴 이름
    private final double price;// 메뉴 가격
    private final String description;// 메뉴 설명

    //생산자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기능
    public String getName() {//메뉴 이름 반환
        return this.name;
    }

    public double getPrice() {//메뉴 가격 반환
        return this.price;
    }

    public String getDescription() {//메뉴 설명 반환
        return this.description;
    }
}
