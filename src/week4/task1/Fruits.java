package week4.task1;

/**
 *Class Fruits có 2 thuộc tính là tên và màu sắc
 * @author Truong Thanh Tu
 */
public class Fruits {
   private String name;
   private String color;

    public Fruits(String name,String color){
        this.name=name;
        this.color=color;
    }

    public Fruits(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * in ra thông tin fruits
     * @return String
     */
    public String toString(){
            return "Quả "+this.getName()+" màu "+this.getColor();
    }
    public static void main(String [] a){
        Fruits fruits=new Fruits("Táo","đỏ");
        System.out.println(fruits.toString());
    }
}
