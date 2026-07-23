package exceptionHandling.trycatch;

public class TryCatch1 {
    public static void main(String[] args) {
        try{

            System.out.println("A");
            int x = 10/2;
            System.out.println(x);

            System.out.println("B");

            String str = null;

            System.out.println(str.length());

            System.out.println("c");

        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

        catch(Exception e){
            System.out.println("general");
        }

        System.out.println("end");
    }
}
