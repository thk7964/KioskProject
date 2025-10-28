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
        for (CartItem item : orderList) {
            System.out.println(item.getMenuItem().getName() + " | w"
                    + item.getMenuItem().getPrice() + " | "
                    + item.getMenuItem().getDescription());
        }
    }

    //메뉴를 장바구니에 저장한다.
    public void addCart(MenuItem item){
        orderList.add(new CartItem(item));
    }

    //장바구니를 비웁니다.
    public void clearCart(){
        orderList.clear();
    }



}
