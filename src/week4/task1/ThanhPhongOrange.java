package week4.task1;

public class ThanhPhongOrange extends Orange{
    public double size;
    public ThanhPhongOrange(String name,String color,double price,double size){
        super(name,color,price);
        this.size=size;
    }
    public ThanhPhongOrange(double price,double size){
        super(price);
        this.size=size;
    }
    public ThanhPhongOrange(double size){
        this.size=size;
    }
    public ThanhPhongOrange(){}

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
