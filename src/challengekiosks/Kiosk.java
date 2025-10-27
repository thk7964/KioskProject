package challengekiosks;

import java.util.*;

public class Kiosk {
    //속성
    private final List<Menu> menuList;// menuList List 선언
    private boolean isCategory = true;//카테고리 선택 화면 반복 실행 여부를 제어하는 변수
    private final Scanner sc = new Scanner(System.in);// Scanner 선언
    private boolean isMenu;//메뉴 선택 화면 반복 실행 여부를 제어하는 변수
    private boolean isOrderChecked = false;

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
                if (categoryChoice >= 1 && categoryChoice <= (this.menuList.size())) {
                    Menu selectCategory = this.menuList.get(categoryChoice - 1);
                    System.out.println("[ " + selectCategory.getCategory() + " MENU ]");
                    selectCategory.showMenu();
                    System.out.println("0. 되돌아가기");
                    System.out.println("======주문할 메뉴를 선택해주세요======");
                    orderMenu(selectCategory);
                }else if (categoryChoice==4){
                    if(isOrderChecked){
                        System.out.println("주문한다!!!!");
                    }
                    else {
                        System.out.println("잘못 입력했습니다.");
                    }
                } else if (categoryChoice==5) {
                    if(isOrderChecked){
                        System.out.println("주문내역 삭제한다!!");
                        isOrderChecked=false;
                    }
                    else {
                        System.out.println("잘못 입력했습니다.");

                    }
                } else if (categoryChoice == 0) {
                    isCategory = false;// 프로그램 종료
                }else{//범위가 넘어가면 오류 발생
                    throw new IllegalArgumentException("카테고리 번호가 잘못됨");
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
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
        if(isOrderChecked){
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. ORDER ");
            System.out.println("5. Cancel ");
        }
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
                    System.out.println(" 위 메뉴를 장바구니에 추가 하시겠습니까?");
                    System.out.println("1. 확인\t 2. 취소");
                    int cartInput= sc.nextInt();//장바구니에 추가
                    if(cartInput==1){
                        System.out.println(selectMenu.getName()+"이 장바구니에 추가되었습니다.");
                        isOrderChecked=true;
                    }else if (cartInput==2){
                        System.out.println("취소 되었습니다.");
                    }else{//범위가 넘어가면 오류 발생
                        throw new IllegalArgumentException("주문 확인 번호가 잘못됨");

                    }
                } else if (choice == 0) {
                    isMenu = false;// 카테고리 선택 창으로 되돌아가기
                } else{//범위가 넘어가면 오류 발생
                    throw new IllegalArgumentException("메뉴 번호가 잘못됨");
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("잘못 입력했습니다.");
                sc.next();//잘못 입력된 값 비우기
            }
        }
    }
}
