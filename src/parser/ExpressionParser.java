package parser;

import structures.InterimResult;
import structures.Operation;

import java.util.Locale;
import java.util.Stack;

public class ExpressionParser {

    public double evaluate(String expression){

        if (expression.length() == 0){
            return 0;
        }

        expression = expression.toLowerCase(Locale.ROOT);
        expression = expression.replaceAll(" ", "");

        boolean isNumber = Character.isDigit(expression.charAt(0));
        double number1 = 0;
        double number2 = 0;
        Operation operation = null;

        Stack<InterimResult> stack = new Stack<InterimResult>();

        StringBuilder termString = new StringBuilder();

        for (int i = 0; i < expression.length(); i++){

            if(Character.isDigit(expression.charAt(i)) == isNumber){
                termString.append(expression.charAt(i));

            }else{
                if (isNumber){
                    if (operation == null){
                        number1 = Double.parseDouble(termString.toString());
                    }else {
                        number2 = Double.parseDouble(termString.toString());


                    }
                    termString = new StringBuilder();



                }else {


                }
            }
        }
        return number1;
    }


}
