package week2.task1;
public class Task1 {
    public static int gcd(int a, int b) {
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public static int fibonacci(int n) {
        if(n==0)return 0;
        else if(n==1)return 1;
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static void main(String[]argc){
        System.out.println(gcd(4,8));
        System.out.println(fibonacci(6));
    }
}