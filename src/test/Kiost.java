package test;

import java.util.*;

public class Kiost {
    private final Scanner sc = new Scanner(System.in);
    private final List<MenuItem> menuItem;

    public Kiost(List<MenuItem> menuItem){
        this.menuItem=menuItem;
    }

    public void start(){
        while (true) {
            try {
                System.out.println("[ isaac toast MENU ]");
                for (int i = 0; i < this.menuItem.size(); i++) {
                    System.out.printf((i+1)+". %-3s | w  %-5.2f |  %s\n",this.menuItem.get(i).getName(),this.menuItem.get(i).getPrice(),this.menuItem.get(i).getDescription());
                }
                System.out.println("0. 종료 | 종료");

                System.out.println("메뉴를 선택하세요 : ");
                int selectMenu = sc.nextInt();

                if (selectMenu>0 && selectMenu<(this.menuItem.size()+1)) {
                    MenuItem item=this.menuItem.get(selectMenu-1);
                    System.out.printf("선택한 메뉴는 : %-3s | w  %-5.2f |  %s\n",item.getName(), item.getPrice(), item.getDescription());
                } else if (selectMenu==0) {
                    System.out.println("프로그램 종료");
                    return;
                }
                else {
                    System.out.println("잘못 입력했습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.nextLine();
            }
        }

    }
}
