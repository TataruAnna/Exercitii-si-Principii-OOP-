package Calculator;

public class Calculator {

    public static int divide(int x, int y){

        if(y==0){ // aici tratez exceptia
            throw new ArithmeticException();
        }
        return x/y;

    }




    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add( double a, double b){
        return a+b;
    }
}
