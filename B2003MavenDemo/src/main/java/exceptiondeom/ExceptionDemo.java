package exceptiondeom;

public class ExceptionDemo {

    public static void main(String[] args) {
        division(2,2);
    }

    public static void division(int x, int y){
        int result = 0;
        try {
             result = x / y;
             return;
        }
        catch (ArithmeticException exception){
            System.out.println("Something happened: " + exception);
        }
        finally {
            System.out.println("Anything happens in the try or catch block finally code block is going to be executed");
        }
        System.out.println(result);
    }
}
