package challengekiosks;

import java.util.*;

public class Cart {
    //속성
    private final List<CartItem> orderList = new ArrayList<>();

    //생산자

    //기능
    //장바구니 안의 메뉴를 보여준다.
    public void showOrderList() {
        System.out.println("[ Order Menu ]");
        //이미 처리한 메뉴 이름을  저장해 중복을 방지
        List<String> pickName = new ArrayList<>();
        //장바구니 목록 확인
        for (CartItem item : orderList) {
            int cnt = 0;//메뉴 주문 수량
            String name = item.getMenuItem().getName();
            double price = item.getMenuItem().getPrice();
            if (pickName.contains(name)) continue;//처리한 중복 메뉴가 있을시 다시 출력을 하지 않도록 한다.
            for (CartItem cartItem : orderList) {// 같은 이름의 메뉴가 몇 번 담겼는지 계산
                if (cartItem.getMenuItem().getName().equals(name)) {
                    cnt++;
                }
            }
            // 메뉴 정보 및 계산 결과 출력
            System.out.printf("%s | w %.2f | %s | 주문 수량 :  %d 개 | 금액 합 : %.2f%n",
                    name, price, item.getMenuItem().getDescription(), cnt, (price * cnt));
            // 처리한 메뉴 저장
            pickName.add(name);
        }
        //장바구니 전체 금액 합계 출력
        System.out.println("[ Total ]");
        System.out.printf("총 금액 : w %.2f%n", getTotalPrice());
    }

    //메뉴를 장바구니에 저장한다.
    public void addCart(MenuItem item) {
        orderList.add(new CartItem(item));
    }

    //장바구니를 비웁니다.
    public void clearCart() {
        orderList.clear();
    }

    //장바구니 총 금액 계산
    public double getTotalPrice() {
        double sum = 0;
        for (CartItem item : orderList) {
            sum += item.getMenuItem().getPrice();
        }
        return sum;
    }
}
