package VC;

public class MathStack extends CharStack {

    public MathStack(int maxSize) {
        super(maxSize);
    }

    public static boolean isOperator (char symbol) {
        switch (symbol) {
            case '+':
            case '-':
            case '*':
            case '/': return true;
        }
        return false;
    }

    public boolean isOperator () {
        return isOperator(peek());
    }

    public static boolean isParenthesis (char symbol) {
            return (symbol == '(' || symbol ==')');
    }

    public boolean isParenthesis () {
        return isParenthesis(peek());
    }

    public static int opPriority (char symbol) {
        switch (symbol) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default : return 0;
        }
    }

    public int opPriority () {
        return opPriority(peek());
    }

    public static boolean isOperand (char symbol) {
        return (!(isOperator(symbol) || isParenthesis(symbol) ));
    }

}
