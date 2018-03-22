package VC;

public class CharStack {
    private int maxSize;
    private char[] stackArray;
    private int top; //top is the index of the top element in stackArray

    public CharStack(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        stackArray = new char[maxSize];
    }

    public void push(char symbol) {
        stackArray[++top] = symbol;
    }

    public char pull() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public char peek(int index) {
        return stackArray[index];
    }

    public boolean isEmpty () {
        return (top==-1);
    }

    public boolean isFull() {
        return (top==maxSize-1);
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom --> top): ");
        for(char c:stackArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }



}

