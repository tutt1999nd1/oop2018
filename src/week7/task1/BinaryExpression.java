package week7.task1;

public abstract class BinaryExpression extends Expression {

        private Expression left;
        private Expression right;

        public BinaryExpression(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }

        public Expression left() { return this.left; }
        public Expression right() { return this.right; }

        @Override
        public abstract String toString();
        @Override
        public abstract int evaluate();
    }


