package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class fan {
    private int number, speed;
    private String status;

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status;    }


    public fan(int number, String status, int speed) {
        this.number = number;
        this.status = status;
        this.speed = speed;
    }

    public void vitri(){
        if(this.number<=3)System.out.println("quat o dau lop");
        else  if(3<this.number&&this.number<=6)System.out.println("quat o giua lop");
        else if(6<this.number&&this.number<=10)System.out.println("quat o cuoi lop");
    }
    public void StatusFan() {
        if (this.status == "on") System.out.println("quat dang bat");
        if (this.status == "off") System.out.println("quat dang tat");
    }

    public void speedFan() {
        if (this.speed > 3) System.out.println("toc do quat nhanh ");
        if (this.speed < 3 || this.speed == 3) System.out.println("toc do quat cham");
    }

    public static void main(String[] a) {
        fan fan1 = new fan(2, "on", 4);
        fan1.vitri();
        fan1.StatusFan();
        fan1.speedFan();
    }
}
class human {
    private double age, height, weight;
    private String sex;

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public human(String sex, double age, double height, double weight) {
        this.sex=sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public boolean sex(){
        return this.sex=="male";

    }

    public void age() {
        if (this.age <= 14) System.out.println("tre con");
        else if (this.age >= 15 && this.age <= 17) System.out.println("vi thanh nien");
        else if (this.age > 17 && this.age < 32) System.out.println("thanh nien");
        else if (this.age >= 33 && this.age <= 50) System.out.println("trung nien");
        else System.out.println("nguoi gia");
    }

    public static void bmi(human boy1) {
        double bmi = (boy1.getWeight() / (boy1.getHeight() * boy1.getHeight()));
        if (bmi < 18.5) System.out.println(" gay");
        else if ((bmi == 18.5 || bmi > 18.5) && bmi < 25) System.out.println("can doi");
        else System.out.println("beo");

    }
    public static void main(String[] argc){
        human n1=new human("male",19, 1.7,65);
        System.out.println(n1.sex());
        n1.age();
        bmi(n1);
    }
}

class  SinhVien {
    private String name,province;
    private int age;
    private String sex;
    public SinhVien(String name, int age, String sex,String province) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.province=province;
    }

    public String getProvince() {return province; }

    public void setProvince(String province) {this.province = province; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public boolean SEX(){
        return this.sex=="nam";
    }
    public boolean NoithanhHanoi(){
        return this.province=="hanoi";
    }

    public void svnammay(){
        if(this.age==18)System.out.println("sinh vien nam nhat");
        else if (this.age==19)System.out.println("sinh vien nam hai");
        else if (this.age==20)System.out.println("sinh vien nam ba");
        else if (this.age==21)System.out.println("sinh vien nam tu");
    }
    //main
    public static void main(String[]argc){
        SinhVien sv1= new SinhVien("a",19,"nam","hanoi");
        System.out.println(sv1.NoithanhHanoi());
        System.out.println(sv1.SEX());
        sv1.svnammay();
    }
}