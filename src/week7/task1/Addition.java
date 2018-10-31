package week7.task1;

public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
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
        return left()+"+"+right();}

    @Override
    public int evaluate() {
        return left().evaluate() + right().evaluate();
    }
}
