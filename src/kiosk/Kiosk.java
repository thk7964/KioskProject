package kiosk;

import java.util.*;

public class Kiosk {
    //속성
    private final List<MenuItem> menuItems;// List 선언 및 초기화
    private boolean flag = true;//프로그램 반복 실행 여부를 제어하는 변수
    private final Scanner sc = new Scanner(System.in);// Scanner 선언

    //생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //기능
    public void start() {// 키오스크 실행
        System.out.println("[ isaac toast MENU ]");
        for (int i = 0; i < this.menuItems.size(); i++) {//List에 저장된 메뉴를 반복문으로 출력
            MenuItem menuItem = this.menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName() + "\t| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }
        System.out.println("0. 종료\t| 종료");

        while (flag) {
            try {
                System.out.println("메뉴를 선택하세요");
                int choice = sc.nextInt();// 메뉴 선택
                //사용자가 입력한 번호에 따라 다른 동작 수행
                if (choice >= 1 && choice <= this.menuItems.size()) {
                    MenuItem selectMenu = this.menuItems.get(choice - 1);
                    System.out.println("선택한 메뉴 :" + selectMenu.getName() + ", "
                            + selectMenu.getPrice() + ", "
                            + selectMenu.getDescription());
                } else if (choice == 0) {
                    flag = false;// 프로그램 종료
                } else {
                    System.out.println("잘못 입력했습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.next();//잘못 입력된 값 비우기
            }
        }
    }
}
