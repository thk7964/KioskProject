package test;

import java.util.*;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final List<Menu> categoryList;

    public Kiosk(List<Menu> categoryList) {
        this.categoryList = categoryList;
    }

    public void start() {
        while (true) {
            try {
                showCategory();
                int selectMenu = sc.nextInt();
                if (selectMenu > 0 && selectMenu < (this.categoryList.size() + 1)) {
                    Menu selectCategory = this.categoryList.get(selectMenu - 1);
                    showMenu(selectCategory);
                    orderMenu(selectCategory);
                } else if (selectMenu == 0) {
                    System.out.println("프로그램 종료");
                    return;
                } else {
                    System.out.println("잘못 입력했습니다.");
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.nextLine();
            }
        }
    }

    public void showCategory() {
        System.out.println("[ isaac toast MENU ]");
        for (int i = 0; i < this.categoryList.size(); i++) {
            Menu categoryMenu = this.categoryList.get(i);
            System.out.printf((i + 1) + ". %-3s \n", categoryMenu.getCategory());
        }
        System.out.println("0. 종료 | 종료");
        System.out.println("메뉴를 선택하세요 : ");
    }

    public void showMenu(Menu selectCategory) {
        System.out.println("[ " + selectCategory.getCategory() + " MENU ]");
        selectCategory.Menus();
        System.out.println("0. 되돌아가기");
        System.out.println("======주문할 메뉴를 선택해주세요======");
    }

    public void orderMenu(Menu selectCategory) {
        while (true) {
            try {
                System.out.println("메뉴를 선택해주세요 : ");
                int choiceMenu = sc.nextInt();
                if (choiceMenu > 0 && choiceMenu <= selectCategory.getMenuItem().size()) {
                    MenuItem selectMenu = selectCategory.getMenuItem().get(choiceMenu - 1);
                    System.out.printf("선택한 메뉴는 : %-3s | w  %-5.2f |  %s\n", selectMenu.getName(), selectMenu.getPrice(), selectMenu.getDescription());
                } else if (choiceMenu == 0) {
                    System.out.println("프로그램 종료");
                    break;
                } else {
                    System.out.println("잘못 입력했습니다.");
                }
            }catch (InputMismatchException e){
                System.out.println("잘못 입력했습니다.");
                sc.nextLine();
            }

        }
    }
}
