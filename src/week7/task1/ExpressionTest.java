package week7.task1;

public class ExpressionTest {
    public static void main(String []a){
        Expression s1= new Numeral(10);
        Expression s2= new Square(s1);
        Expression s3= new Subtraction(s2, new Numeral(1));
        Expression s4= new Multiplication(new Numeral(2),new Numeral(3));
        Expression s5= new Addition(s3,s4);
        Expression s6= new Square(s5);
        System.out.println(s6.toString()+" = "+s6.evaluate());
        Expression s7= new Numeral(0);

        try{
                Expression s8= new Division(s1,s7);
                System.out.println(s8.toString()+" = "+s8.evaluate());
            }
            catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
