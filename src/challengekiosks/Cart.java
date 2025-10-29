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
        //장바구니 목록 확인
        for (CartItem item : orderList) {

            //메뉴 주문 수량
            String name = item.getMenuItem().getName();
            double price = item.getMenuItem().getPrice();
            int quantity = item.getQuantity();
            // 메뉴 정보 및 계산 결과 출력
            System.out.printf("%s | w %.2f | %s | 주문 수량 :  %d 개 | 금액 합 : %.2f%n",
                    name, price, item.getMenuItem().getDescription(), quantity, (price * quantity));
        }
        //장바구니 전체 금액 합계 출력
        System.out.println("[ Total ]");
        System.out.printf("총 금액 : w %.2f%n", getTotalPrice());
    }

    //메뉴를 장바구니에 저장한다.
    public void addCart(MenuItem item) {
        for (CartItem cartItem : orderList) {
            //중복된 메뉴가 있으면 수량만 증가 후 종료
            if (cartItem.getMenuItem().getName().equals(item.getName())) {
                cartItem.increaseQuantity();
                return;
            }
        }
        //장바구니에 중복된 메뉴가 없으면 메뉴 추가
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
            //메뉴의 금액과 수량을 곱한다.
            sum += item.getMenuItem().getPrice() * item.getQuantity();
        }
        return sum;
    }
}
