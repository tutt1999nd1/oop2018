package week5_6;

/**
        * Clas Shape có 2 thuộc tính color và filles
        * @author Truong Thanh Tu
        */
public class Shape {
    private String color = "red";
    private boolean filled = true;

    /**
     *
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * in ra thông tin Shape
     * @return thông tin của Shape
     */
    public String toString(){
        return color +" "+filled;
    }


}

