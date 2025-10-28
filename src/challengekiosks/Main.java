package challengekiosks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Toast 카테고리에 메뉴를 저장
        Menu toast = new Menu("Toast");
        toast.addMenuItems(new MenuItem("햄치즈 토스트", 3.3, "햄과 치즈의 완벽한 조합, 이삭토스트 시그니처 메뉴"));
        toast.addMenuItems(new MenuItem("햄 스페셜 토스트", 3.8, "햄치즈에 피클, 양배추로 더 풍성한 맛을 느껴보세요"));
        toast.addMenuItems(new MenuItem("베이컨 베스트", 4.3, "짭짤한 베이컨과 양배추의 매력적인 조합을 만나보세요"));
        toast.addMenuItems(new MenuItem("햄치즈 포테이토", 4.4, "햄치즈에 해시브라운이 더해져 든든하게 즐길 수 있어요"));
        toast.addMenuItems(new MenuItem("감자 스페셜", 4.8, "고소한 해시브라운과 베이컨, 양배추로 풍성한 식감을 즐겨보세요"));
        toast.addMenuItems(new MenuItem("딥치즈 베이컨", 4.6, "베이컨과 딥치즈 소스, 모짜렐라 치즈로 진한 고소함을 만나보세요"));
        toast.addMenuItems(new MenuItem("딥치즈 베이컨 포테이토", 5.3, "해시브라운과 베이컨, 딥치즈 소스의 깊은 풍미를 느껴보세요"));
        toast.addMenuItems(new MenuItem("스크램블 베이컨", 4.8, "부드러운 스크램블과 짭짤한 베이컨, 치즈의 조화를 느껴보세요"));
        //Side 카테고리에 메뉴를 저장
        Menu side = new Menu("Side");
        side.addMenuItems(new MenuItem("포테이토 팝(시즈닝)", 2.4, "한입 사이즈의 감자튀김과 시즈닝이 만났어요"));
        side.addMenuItems(new MenuItem("어니언 포테이토 팝", 2.8, "달콤한 어니언 소스와 바삭한 한 입 사이즈 감자 튀김이 만났어요"));
        side.addMenuItems(new MenuItem("치즈 팝", 2.8, "고소한 모짜렐라 치즈가 들어간 한 입 사이즈 치즈스틱이에요"));
        side.addMenuItems(new MenuItem("포테이토 팝", 2.1, "바삭하고 고소한 한 입 사이즈 감자 튀김이에요"));
        //Drink 카테고리에 메뉴를 저장
        Menu drink = new Menu("Drink");
        drink.addMenuItems(new MenuItem("디카페인 아메리카노", 3.4, "카페인 함량이 낮아 부담이 적은 아메리카노에요"));
        drink.addMenuItems(new MenuItem("아메리카노", 2.9, "직접 로스팅한 아라비카 원두의 깊은 풍미를 담았어요"));
        drink.addMenuItems(new MenuItem("콜라 / 제로 콜라", 2.0, "청량한 탄산, 콜라"));
        drink.addMenuItems(new MenuItem("사이다 / 제로 사이다", 2.0, "청량한 탄산, 사이다"));
        drink.addMenuItems(new MenuItem("아이스티", 2.8, "복숭아 향을 가득 담아 달콤하고 시원하게 즐겨보세요"));
        //카테고리를 저장할 List 선언
        List<Menu> menuList = new ArrayList<>();
        //각 메뉴를 List에 저장
        menuList.add(toast);
        menuList.add(side);
        menuList.add(drink);
        Kiosk kiosk = new Kiosk(menuList);// menuItems에 저장된 메뉴값을 Kiosk 클래스에 보낸다.
        kiosk.start();// 키오스크 실행
    }
}
