package exceptionHandling.trycatch;

public class nestedTry {
    public static void main(String[] args) {
        try{
            System.out.println("outer try start. ");

            try{
                String s = null;
                System.out.println(s.length());
            }
            catch(Exception e){
                System.out.println("inner  catch");
            }

            System.out.println("after inner try");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

        System.out.println("program is end");
    }
}
