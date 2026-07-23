package exceptionHandling.trycatch;

// ---------------------ATM Withdrawal System ----------------------

public class ATM {
    public static void main(String[] args) {

        System.out.println("------ ATM machine strated---------");
        try{
            int balance = 5000;
            int withdraw = 1000;
            
            System.out.println("Checking ATM Machine....");

            try{
                String card = null;

                System.out.println(card.length());

            }
            catch(ArithmeticException e){
                System.out.println("Inner Catch : Arithmetic Exception");
            }

            balance = balance - withdraw;

            System.out.println("remaning balance: " + balance);
        }

        catch(ArithmeticException e){
            System.out.println("Outer Catch : Arithmetic Exception");
        }

        catch(NullPointerException e){
            System.out.println("Outer Catch : Card Read Failed");
        }
        finally{
            System.out.println("closing ATM connection....");
        }

        System.out.println("atm close");
    }
}
