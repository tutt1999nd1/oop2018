package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
<<<<<<< HEAD
        a=Math.abs(a);
        b= Math.abs(b);
        if(b==0)return a;
        return gcd(b,a%b);
    }

    public static int fibonacci(int n) {
        if(n==0)return 0;
        else if(n==1)return 1;
        return fibonacci(n-1)+ fibonacci(n-2);
=======
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        return 0;
>>>>>>> upstream/master
    }
}
