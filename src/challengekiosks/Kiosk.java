package challengekiosks;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    private final List<Menu> menuList;// menuList List 선언
    private boolean isCategory = true;//카테고리 선택 화면 반복 실행 여부를 제어하는 변수
    private final Scanner sc = new Scanner(System.in);// Scanner 선언
    private boolean isMenu;//메뉴 선택 화면 반복 실행 여부를 제어하는 변수

    //생성자
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    //기능
    public void start() {// 키오스크 실행
        while (isCategory) {
            isMenu = true;//메뉴 선택 활성화
            showCategory();//카테고리를 화면에 출력
            try {
                System.out.println("카테고리를 선택하세요");
                int categoryChoice = sc.nextInt();// 카테고리를 선택
                //사용자가 입력한 번호에 따라 다른 동작 수행
                if (categoryChoice >= 1 && categoryChoice <= this.menuList.size()) {
                    Menu selectCategory = this.menuList.get(categoryChoice - 1);
                    System.out.println("[ " + selectCategory.getCategory() + " MENU ]");
                    selectCategory.showMenu();
                    System.out.println("0. 되돌아가기");
                    System.out.println("======주문할 메뉴를 선택해주세요======");
                    orderMenu(selectCategory);
                } else if (categoryChoice == 0) {
                    isCategory = false;// 프로그램 종료
                } else {
                    System.out.println("잘못 입력했습니다.");
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.next();//잘못 입력된 값 비우기
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
    //카테고리 메뉴 화면에 출력
    public void showCategory(){
        System.out.println("[ isaac toast MENU ]");
        for (int i = 0; i < this.menuList.size(); i++) {//List에 저장된 메뉴를 반복문으로 출력
            Menu categoryMenu = this.menuList.get(i);
            System.out.println((i + 1) + ". " + categoryMenu.getCategory());
        }
        System.out.println("0. 종료");

    }
    //사용자가 선택한 메뉴를 출력
    public void orderMenu(Menu selectCategory) {
        while (isMenu) {
            try {
                System.out.println("메뉴를 선택하세요");
                int choice = sc.nextInt();// 메뉴 선택
                //사용자가 입력한 번호에 따라 다른 동작 수행
                if (choice >= 1 && choice <= selectCategory.getMenuItem().size()) {
                    MenuItem selectMenu = selectCategory.getMenuItem().get(choice - 1);
                    System.out.println("선택한 메뉴 :" + selectMenu.getName() + ", "
                            + selectMenu.getPrice() + ", "
                            + selectMenu.getDescription());
                } else if (choice == 0) {
                    isMenu = false;// 카테고리 선택 창으로 되돌아가기
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
