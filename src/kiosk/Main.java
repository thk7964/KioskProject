package kiosk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();// List 선언 및 초기화
        boolean flag = true;//프로그램 반복 실행 여부를 제어하는 변수
        Scanner sc = new Scanner(System.in);// Scanner 선언

        //각 메뉴를 List에 저장
        menuItems.add(new MenuItem("햄치즈 토스트", 3.3, "햄과 치즈의 완벽한 조합, 이삭토스트 시그니처 메뉴"));
        menuItems.add(new MenuItem("햄 스페셜 토스트", 3.8, "햄치즈에 피클, 양배추로 더 풍성한 맛을 느껴보세요"));
        menuItems.add(new MenuItem("베이컨 베스트", 4.3, "짭짤한 베이컨과 양배추의 매력적인 조합을 만나보세요"));
        menuItems.add(new MenuItem("햄치즈 포테이토", 4.4, "햄치즈에 해시브라운이 더해져 든든하게 즐길 수 있어요"));
        menuItems.add(new MenuItem("감자 스페셜", 4.8, "고소한 해시브라운과 베이컨, 양배추로 풍성한 식감을 즐겨보세요"));
        menuItems.add(new MenuItem("딥치즈 베이컨", 4.6, "베이컨과 딥치즈 소스, 모짜렐라 치즈로 진한 고소함을 만나보세요"));
        menuItems.add(new MenuItem("딥치즈 베이컨 포테이토", 5.3, "해시브라운과 베이컨, 딥치즈 소스의 깊은 풍미를 느껴보세요"));
        menuItems.add(new MenuItem("스크램블 베이컨", 4.8, "부드러운 스크램블과 짭짤한 베이컨, 치즈의 조화를 느껴보세요"));

        System.out.println("[ isaac toast MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {//List에 저장된 메뉴를 반복문으로 출력
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName() + "\t| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }
        System.out.println("0. 종료\t| 종료");

        while (flag) {
            try {
                System.out.println("메뉴를 선택하세요");
                int choice = sc.nextInt();// 메뉴 선택
                //사용자가 입력한 번호에 따라 다른 동작 수행
                if (choice >= 1 && choice <= menuItems.size()) {
                    MenuItem selectMenu = menuItems.get(choice - 1);
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
        System.out.println("프로그램을 종료합니다.");
    }
}
