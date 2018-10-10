package week4.task1;

public class SanhOrange extends Orange{
    private String sweet;
    public SanhOrange(String name,String color,double price,String sweet){
        super(name,color,price);
        this.sweet=sweet;
    }
    public SanhOrange(double price,String sweet){
        super(price);
        this.sweet=sweet;
    }
    public SanhOrange(String sweet){
        this.sweet=sweet;
    }
    public SanhOrange(){}

    public String getSweet() {
        return sweet;
    }

    public void setSweet(String sweet) {
        this.sweet = sweet;
    }
}
