package exceptionHandling.trycatch;

public class ArrayException {
    public static void main(String[] args) {
        try{
                int arr [] = {34,87,8};
                System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("program end ");
    }
}
