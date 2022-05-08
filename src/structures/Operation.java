package structures;

import java.util.Spliterator;

public enum Operation {

    PLUS("+",2){
        public double  calc( double number1, double number2){
            return number1 + number2;

        }
    }
    ,
    MINUS("-",2){
        public double  calc( double number1, double number2){
            return number1-number2;
        }
    },
    TIMES("*",2){
        public double  calc( double number1, double number2){
            return number1*number2;
        }
    },
    DIVIDE("/",2){
        public double  calc( double number1, double number2){
            return number1/number2;
        }
    },
    BRACKET("(",1){
        public double  calc( double number1, double number2){
            return number1;
        }
    },
    END_BRACKET(")",1){
        public double  calc( double number1, double number2){
            return number1;
        }
    },
    SIN("sin",1){
        public double  calc( double number1, double number2){
            return Math.sin(number1);
        }
    },
    COS("cos",1){
        public double  calc( double number1, double number2){
            return Math.cos(number1);
        }
    },
    TAN("tan",1){
        public double  calc( double number1, double number2){
            return Math.tan(number1);
        }
    },
    COTG("cotg",1){
        public double calc( double number1, double number2){
            return 1/Math.tan(number1);
        }
    };


    private static final Operation[] operations = {PLUS, MINUS, TIMES, DIVIDE, BRACKET, END_BRACKET, SIN, COS, TAN,
            COTG};
    private String operationString;
    private int argumentNumber;

    Operation(String operationString, String regexString, int depthLevel){
        this.operationString = operationString;
        this.regexString = regexString;
        this.depthLevel = depthLevel;
    }

    public static Operation parse(String operationString) {
        for (Operation operation : Operation.values()){
            if (operationString.equals(operation.operationString)){
                return operation;
            }
        }
        return null;
    }

    public static String insertSpaces(String expression){
        
    }

}
