package week4.task1;

/**
 * Class Sanhorange kế thừa 3 thuộc tính từ Orange và thêm 1 thuộc tính sweet(độ ngọt)
 * @author Truong Thanh Tu
 */
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

    /**
     * Kiểm tra giá của Sanhorange
     * @return thông tin giá
     */
    public String Sanh(){
        String sanh="";
        if(this.getPrice()>60000)sanh="cam đắt";
        else if(this.getPrice()<=60000&&this.getPrice()>=50000)sanh="giá bình thường";
        else sanh="giá rẻ";
        return sanh;
    }

    /**
     * Kiểm tra độ ngọt của Sanhorange
     * @return thông tin độ ngọt
     */
    public String sweet(){
        String sweet="";
        if(this.getSweet()=="Ngọt")sweet="Cam ngọt";
        else if(this.getSweet()=="Chua")sweet="Cam ngọt";
        else sweet="cam bình thường";
        return sweet;
    }
}
