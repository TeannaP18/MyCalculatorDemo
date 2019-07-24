package hbcu.stay.ready.ttime;

public class Calculator {
    private double memory;

    public Calculator(){
        memory = 0;
    }

    public Calculator(double memory) {

        this.memory = memory;
    }

    public double add(double x){
        memory += x;
        return memory;
    }

    public double add(double x, double y){
        return 0;
    }

    public double subtract(double x){
        memory -= x;
        return memory;
    }

    public double multiply(double x){
        memory *= x;
        return memory;
    }

    public double divide(double x) throws ArithmeticException{
        if(x == 0.0){
            throw new ArithmeticException();
        }
        memory /= x;
        return memory;
    }
    /*
    public double divide(double x, double y) throws ArithmeticException{
    If(x==0.0){
    throw new ArithmeticExpression();
    }
    y/= x;
    return y;
     */

    public double square(){
        double value = Math.pow(memory, 2);
        return value;
    }

    public double squareRoot(){
        double value = Math.sqrt(memory);
        return value;
    }
    public double exponent(double number){
        double value = Math.pow(number, memory);
        return value;
    }
    public double inverseNumber(){
        double value = memory;
        double inverse = 1/value;
        return inverse;
    }

    public double signSwitch(double number){
        if(number > 0){
            return (memory *-1);

        }
        else{
            return (memory *-1);
        }

    }
}
