package challengekiosks;

public class CartItem {
    //속성
    private final MenuItem menuItem;//장바구니에 담긴 메뉴 아이템
    private int quantity;

    //생산자
    public CartItem(MenuItem menuItem) {
        this.menuItem = menuItem;
        quantity = 1;// 초기 수량은 1
    }

    //기능
    //메뉴 아이템 반환(게터)
    public MenuItem getMenuItem() {
        return menuItem;
    }

    //장바구니에 담긴 메뉴의 수량 반환
    public int getQuantity() {
        return quantity;
    }

    //이미 장바구니에 담긴 메뉴면 수량 증가
    public void increaseQuantity() {
        quantity++;
    }
}
