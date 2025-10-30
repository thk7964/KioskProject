package test;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[ isaac toast MENU ]");
        System.out.println("1. 햄치즈 토스트 | 3.3 | 햄과 치즈의 완벽한 조합, 이삭토스트 시그니처 메뉴");
        System.out.println("2. 햄 스페셜 토스트 | 3.8 | 햄치즈에 피클, 양배추로 더 풍성한 맛을 느껴보세요");
        System.out.println("3. 베이컨 베스트 | 4.3 | 짭짤한 베이컨과 양배추의 매력적인 조합을 만나보세요");
        System.out.println("4. 햄치즈 포테이토 | 4.4 | 햄치즈에 해시브라운이 더해져 든든하게 즐길 수 있어요");
        System.out.println("5. 감자 스페셜 | 4.8 | 고소한 해시브라운과 베이컨, 양배추로 풍성한 식감을 즐겨보세요");
        System.out.println("0. 종료 | 종료");


        while (true) {
            try {
                System.out.println("메뉴를 선택하세요 : ");
                int selectMenu = sc.nextInt();
                switch (selectMenu) {
                    case 1:
                        System.out.println("햄치즈 토스트를 선택했습니다.");
                        break;
                    case 2:
                        System.out.println("햄 스페셜 토스트를 선택했습니다.");
                        break;
                    case 3:
                        System.out.println("베이컨 베스트를 선택했습니다.");
                        break;
                    case 4:
                        System.out.println("햄치즈 포테이토를 선택했습니다.");
                        break;
                    case 5:
                        System.out.println("감자 스페셜를 선택했습니다.");
                        break;
                    case 0:
                        System.out.println("프로그램 종료");
                        return;
                    default:
                        System.out.println("잘못 입력했습니다.");

                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.nextLine();
            }
        }
    }
}
