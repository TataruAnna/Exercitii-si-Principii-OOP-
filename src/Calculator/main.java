package Calculator;

public class main {
    public static void main(String[] args) {
//        System.out.println(Calculator.add(5,8));
//        System.out.println(Calculator.add(23.3,5.6));
        try{
            System.out.println((Calculator.divide(8,0))); // incerc sa apele functia cu exceptia mea y =0
        }
        catch (ArithmeticException e){  //daca imi intra pe exceptie, o prind intr - o variabila e din Clasa ArithmeticEx
            System.out.println("operatiunea nu e posibila "); //printez un mesaj corespunzator pentru cazurile din corpul asta, aici main 
        }
    }
}
