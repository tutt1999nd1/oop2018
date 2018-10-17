package week4.task1;

/**
 * class Apple kế thừa 2 thuộc tinh của Fruits và thêm 1 thuộc tính weight
 * @author Truong Thanh Tu
 */
public class Apple extends Fruits{
    private double weight;
    public Apple(String name,String color,double weight){
        super(name,color);
        this.weight=weight;
    }
    public Apple(){}

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * kiểm tra kích thước cảu Apple
     * @return thông tin kích thước
     */
    public String Tao(){
        String test="";
        if(this.getWeight()>3){
            test="to";
        }
        else test="nhỏ";
        return test;
    }

    /**
     * in ra thông tin của Apple
     * @return thông tin cỦA apple
     */
    public String toString(){
        return this.getName()+" màu "+this.getColor()+" "+this.Tao();
    }
    public static void main(String []a){
        Apple apple= new Apple();
        apple.setWeight(2.0);
        System.out.println(apple.Tao());


    }
}
