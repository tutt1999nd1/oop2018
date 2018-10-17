package week4.task1;

/**
 * Class ThanhPhongOrange kế thừa 3 thuộc tính từ class Orange
 * @author Truong Thanh Tu
 */
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

    /**
     * kiểm tra kích thước của cam
     * @return thông tin kích thước
     */
    public String hinhdang(){
        String hinhdang="";
        if(this.getSize()>=3)hinhdang="cam to";
        else if(this.getSize()<3&&this.getSize()>=2.5)hinhdang="cam bình thường";
        else hinhdang="cam nhỏ";
        return hinhdang;
    }

    /**
     * in ra thông tin của ThanhPhongOrange
     * @return thông tin
     */
    public String toString(){
        return this.hinhdang()+" giá "+this.getPrice();
    }
}
