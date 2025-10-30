package test;

public class MenuItem {
    //속성
    private final String name;
    private final double price;
    private final String description;

    //생성자
    public MenuItem(String name,double price,String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    //기능
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }

}