package kiosk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();// List 선언 및 초기화

        //각 메뉴를 List에 저장
        menuItems.add(new MenuItem("햄치즈 토스트", 3.3, "햄과 치즈의 완벽한 조합, 이삭토스트 시그니처 메뉴"));
        menuItems.add(new MenuItem("햄 스페셜 토스트", 3.8, "햄치즈에 피클, 양배추로 더 풍성한 맛을 느껴보세요"));
        menuItems.add(new MenuItem("베이컨 베스트", 4.3, "짭짤한 베이컨과 양배추의 매력적인 조합을 만나보세요"));
        menuItems.add(new MenuItem("햄치즈 포테이토", 4.4, "햄치즈에 해시브라운이 더해져 든든하게 즐길 수 있어요"));
        menuItems.add(new MenuItem("감자 스페셜", 4.8, "고소한 해시브라운과 베이컨, 양배추로 풍성한 식감을 즐겨보세요"));
        menuItems.add(new MenuItem("딥치즈 베이컨", 4.6, "베이컨과 딥치즈 소스, 모짜렐라 치즈로 진한 고소함을 만나보세요"));
        menuItems.add(new MenuItem("딥치즈 베이컨 포테이토", 5.3, "해시브라운과 베이컨, 딥치즈 소스의 깊은 풍미를 느껴보세요"));
        menuItems.add(new MenuItem("스크램블 베이컨", 4.8, "부드러운 스크램블과 짭짤한 베이컨, 치즈의 조화를 느껴보세요"));

        Kiosk kiosk = new Kiosk(menuItems);// menuItems에 저장된 메뉴값을 Kiosk 클래스에 보낸다.
        kiosk.start();// 키오스크 실행
        System.out.println("프로그램을 종료합니다.");
    }
}
