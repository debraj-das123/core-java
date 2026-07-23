package exceptionHandling.throwANDthrows;

public class throw1 {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18){
            throw new ArithmeticException("user not eligible");
        }

        System.out.println("welcome");
    }
}
