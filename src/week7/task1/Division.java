package week7.task1;

public class Division extends BinaryExpression {
    public Division(Expression left, Expression right)throws ArithmeticException {
        super(left, right);
    }

    @Override
    public Expression left() {
        return super.left();
    }

    @Override
    public Expression right() {
        return super.right();
    }

    @Override
    public String toString() {
        return left()+"/"+right();}

    @Override
    public int evaluate()throws ArithmeticException {
        if(right().evaluate()==0)throw new ArithmeticException("Lỗi chia cho 0");

        return left().evaluate() / right().evaluate();
    }
}
