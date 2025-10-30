package test;

import java.util.*;

public class Menu {
    //속성
    private final List<MenuItem> menuItems;
    private final String category;

    //생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    //기능
    public String getCategory() {
        return category;
    }

    public void addMenuItems(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItem() {
        return menuItems;
    }

    public void Menus() {
        for (int i = 0; i < this.menuItems.size(); i++) {
            System.out.printf((i + 1) + ". %-3s | w  %-5.2f |  %s\n",
                    menuItems.get(i).getName(), menuItems.get(i).getPrice(), menuItems.get(i).getDescription());
        }
    }
}
