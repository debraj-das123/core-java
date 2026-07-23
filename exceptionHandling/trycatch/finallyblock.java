package exceptionHandling.trycatch;

public class finallyblock {
    public static void main(String[] args) {
        try{
            System.out.println("A");
            int x = 12/3;

            System.out.println(x);
        }

        catch(ArithmeticException e){
            System.out.println("B");
        }

        finally{
            System.out.println("C");
        }

        System.out.println("D");
    }
   
}
