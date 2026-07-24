package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class Append {
  public static void main(String [] args){
    try{
      FileWriter fw = new FileWriter("text.txt", true);
      fw.write("hello devraj i am cominh back");
      fw.close();
      System.out.println("file append is completed");

    }catch(IOException e){
      System.out.println("error" + e.getMessage());
    }
  }
}
