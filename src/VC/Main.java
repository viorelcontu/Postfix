package VC;


public class Main {

    public static void main(String[] args) {
        String Equation = "(A+B*C/D)/(E+F*G)";
//        Postfix Converter = new Postfix(Equation);
//
//        System.out.println(Converter);
        System.out.println(new Postfix(Equation));

    }
}
