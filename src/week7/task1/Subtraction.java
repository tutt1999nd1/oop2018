package week7.task1;


public class Subtraction extends BinaryExpression {

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return left()+"-"+right();
    }

    @Override
    public int evaluate() {
        return left().evaluate() - right().evaluate();
    }
}
