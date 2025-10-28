package challengekiosks;

public class CartItem {
    //속성
    private final MenuItem menuItem;//장바구니에 담긴 메뉴 아이템
    //생산자
    public CartItem(MenuItem menuItem){
        this.menuItem=menuItem;
    }
    //기능
    //메뉴 아이템 반환(게터)
    public MenuItem getMenuItem(){
        return menuItem;
    }
}
