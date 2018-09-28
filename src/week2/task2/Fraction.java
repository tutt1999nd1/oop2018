package week2.task2;
import static week2.task1.Task1.gcd;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;

    public int getTs() {
        return numerator;
    }
    public void setTs(int x ) {
        numerator=x;
    }
    public int getMs(){
        return denominator;
    }
    public void setMs(int y){
        denominator=y;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void toiGianPhanSo() {
        int i = gcd(this.getTs(), this.getMs());
        this.setTs(this.getTs() / i);
        this.setMs(this.getMs() / i);
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới\

        int numerator,denominator;
        numerator=this.getTs()*other.getMs()+this.getMs()*other.getTs();
        denominator=this.getMs()*other.getMs();
        Fraction tong= new Fraction(numerator,denominator);
        tong.toiGianPhanSo();
        return tong;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator,denominator;
        numerator=this.getTs()*other.getMs()-this.getMs()*other.getTs();
        denominator=this.getMs()*other.getMs();
        Fraction hieu= new Fraction(numerator,denominator);
        hieu.toiGianPhanSo();
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator,denominator;
        numerator=this.getTs()*other.getTs();
        denominator=this.getMs()*other.getMs();
        Fraction tich= new Fraction(numerator,denominator);
        tich.toiGianPhanSo();
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator,denominator;
        numerator=this.getTs()*other.getMs();
        denominator=this.getMs()*other.getTs();
        Fraction chia= new Fraction(numerator,denominator);
        chia.toiGianPhanSo();
        return chia;
    }
    public boolean equals(Object obj)
    {

        return (((Fraction) obj).numerator*this.denominator == this.numerator*((Fraction) obj).denominator);
    }
}
