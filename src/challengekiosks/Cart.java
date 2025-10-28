package challengekiosks;

import java.util.*;

public class Cart {
    //속성
    private final List<CartItem> orderList= new ArrayList<>();

    //생산자

    //기능
    //장바구니 안의 메뉴를 보여준다.
    public void showOrderList(){
        System.out.println("[ Order Menu ]");
        List<String> pickName = new ArrayList<>();
        for (CartItem item : orderList) {
            int cnt=0;
            String name =item.getMenuItem().getName();
            double price = item.getMenuItem().getPrice();
            if (pickName.contains(name)) continue;
            for (CartItem cartItem : orderList) {
                if (cartItem.getMenuItem().getName().equals(name)) {
                    cnt++;
                }
            }
            System.out.printf("%s | w %s | %s | 주문 수량 :  %d 개 | 금액 합 : %s%n",
                    name, price, item.getMenuItem().getDescription() , cnt, price * (double) cnt);
            pickName.add(name);
        }
        System.out.println("[ Total ]");
        System.out.printf("총 금액 : w %.2f",getTotalPrice());
    }

    //메뉴를 장바구니에 저장한다.
    public void addCart(MenuItem item){
        orderList.add(new CartItem(item));
    }

    //장바구니를 비웁니다.
    public void clearCart(){
        orderList.clear();
    }

    //총합 계산
    public double getTotalPrice(){
        double sum=0;
        for (CartItem item : orderList) {
            sum += item.getMenuItem().getPrice();
        }
        return sum;
    }

}
