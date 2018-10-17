package week4.task1;

/**
 * Class Orange kế thừa 2 thuộc tính name và color của Class Fruits và có 1 thêm thuộc tính price(Giá)
 * @author Truong Thanh Tu
 */
public class Orange extends Fruits{
    private double price;
    public Orange(String name,String color,double price){
        super(name,color);
        this.price=price;
    }

    public Orange(double price){
        this.price=price;
    }
    public Orange(){};

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Kiểm tra độ xanh chín
     * @return Độ chín
     */
    public String chin(){
        String cam="" ;
        if(this.getColor()=="Xanh")cam="xanh";
        else if(this.getColor()=="Cam")cam=" chín";
        return cam;
    }
    /**
     * In ra thông tin của orange
     * @return thông tin
     */
    public String toString(){
        return this.getName()+" "+this.chin();
    }
}
