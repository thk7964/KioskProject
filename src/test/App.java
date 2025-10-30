package test;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<MenuItem> items=new  ArrayList<>();

        items.add(new MenuItem("햄치즈 토스트", 3.3, "햄과 치즈의 완벽한 조합, 이삭토스트 시그니처 메뉴"));
        items.add(new MenuItem("햄 스페셜 토스트", 3.8, "햄치즈에 피클, 양배추로 더 풍성한 맛을 느껴보세요"));
        items.add(new MenuItem("베이컨 베스트", 4.3 , "짭짤한 베이컨과 양배추의 매력적인 조합을 만나보세요"));
        items.add(new MenuItem("햄치즈 포테이토", 4.4, "햄치즈에 해시브라운이 더해져 든든하게 즐길 수 있어요"));
        items.add(new MenuItem("감자 스페셜", 4.8, "고소한 해시브라운과 베이컨, 양배추로 풍성한 식감을 즐겨보세요"));

        Kiosk kiost=new Kiosk(items);
        kiost.start();

    }
}
