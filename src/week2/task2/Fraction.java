package week2.task2;

import static week2.task1.Task1.gcd;
public class Fraction {

    private int ts, ms;
    public Fraction(int numerator, int denominator) {

        this.ts=numerator;
        this.ms=denominator;
    }

    public int getTs() {
        return ts;
    }
    public void setTs(int x ) {
        ts=x;
    }
    public int getMs(){
        return ms;
    }
    public void setMs(int y){
        ms=y;
    }

    public void toiGianPhanSo() {
        int i = gcd(this.getTs(), this.getMs());
        this.setTs(this.getTs() / i);
        this.setMs(this.getMs() / i);
    }

    public Fraction add(Fraction other) {

        int ts,ms;
        ts=this.getTs()*other.getMs()+this.getMs()*other.getTs();
        ms=this.getMs()*other.getMs();
        Fraction tong= new Fraction(ts,ms);
        tong.toiGianPhanSo();
        return tong;
    }
    public Fraction subtract(Fraction other) {

        int ts,ms;
        ts=this.getTs()*other.getMs()-this.getMs()*other.getTs();
        ms=this.getMs()*other.getMs();
        Fraction hieu= new Fraction(ts,ms);
        hieu.toiGianPhanSo();
        return hieu;
    }
    public Fraction multiply(Fraction other) {
        int ts,ms;
        ts=this.getTs()*other.getTs();
        ms=this.getMs()*other.getMs();
        Fraction tich= new Fraction(ts,ms);
        tich.toiGianPhanSo();
        return tich;
    }
    public Fraction divide(Fraction other) {
        int ts,ms;
        ts=this.getTs()*other.getMs();
        ms=this.getMs()*other.getTs();
        Fraction chia= new Fraction(ts,ms);
        chia.toiGianPhanSo();
        return chia;
    }
    public boolean equals(Object obj)
    {

        return (((Fraction) obj).ts*this.ms == this.ts*((Fraction) obj).ms);
    }
    public static void main(String [] argc){
        Fraction ps= new Fraction(1,6);
        Fraction ps1= new Fraction(2, 6);
        Fraction ps2= ps.add(ps1);
        System.out.println(ps2.getTs()+"/"+ps2.getMs());

        System.out.println(ps.equals(ps1));

    }
}