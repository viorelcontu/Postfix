package VC;

public class Postfix {
    private MathStack stack;
    private String input;
    private String output;

    public Postfix(String input) {
        this.input = input;
        output = "";
        stack = new MathStack(input.length());
    }

    @Override
    public String toString() {
        return  convert();
    }

    private String convert () {
        char hand;

        for (int j=0; j<input.length(); j++) {
            hand = input.charAt(j);

            if (stack.isOperand(hand)) output += hand;

            if (stack.isOperator(hand)) {
                if (stack.isEmpty()) stack.push(hand); else {

                    while (!stack.isEmpty() && !stack.isParenthesis()) {
                        if (stack.opPriority(hand) <= stack.opPriority()) output += stack.pull(); else break;
                    }
                    stack.push(hand);
                }
            }

            if (stack.isParenthesis(hand)) {
                if (hand == '(') stack.push(hand); else {
                    while (!stack.isParenthesis()) {
                        output += stack.pull();
                    }

                    stack.pull(); //remove the parenthesis
                }
            }
        }

        //after you reach the end of the input, you need to pull everything from stack
        while (!stack.isEmpty()) {
            output += stack.pull();
        }
        return output;
    }
}
