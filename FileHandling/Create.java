package FileHandling;
import java.io.File;
import java.io.IOException;
public class Create {
  public static void main(String[] args){
    try{
      File file = new File("text.txt");
      if(file.createNewFile()){
        System.out.println("file created successfull");
      }
      else{
        System.out.println("file already exsist");
      }
    }catch(IOException e){
      System.out.println("error");
    }
  }
}
