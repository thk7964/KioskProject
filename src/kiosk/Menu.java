package kiosk;

import java.util.*;

public class Menu {
    //속성
    private final String category;//카테고리
    private final List<MenuItem> menuItems;//menuItems list 선언

    //생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    //기능
    //category 값 반환 (게터)
    public String getCategory() {
        return this.category;
    }
    //menuItems list에 menuItem 내용 저장
    public void addMenuItems(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }
    //menuItems 리스트 내용 반환 (게터)
    public List<MenuItem> getMenuItem() {
        return this.menuItems;
    }
    //menuItems 리스트에 저장된 내용 print
    public void showMenu() {
        for (int i = 0; i < this.menuItems.size(); i++) {
            System.out.println((i + 1) + ". "
                    + this.menuItems.get(i).getName()
                    + "\t| W " + this.menuItems.get(i).getPrice()
                    + " | " + this.menuItems.get(i).getDescription());
        }
    }

}
