package week4.task1;

/**
 *Class Fruits có 2 thuộc tính là tên và color
 * @param
 * @param
 */
public class Fruits {
   private String name;
   private String color;

    public Fruits(String name,String color){
        this.name=name;
        this.color=color;
    }

    public Fruits(){};
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
}
