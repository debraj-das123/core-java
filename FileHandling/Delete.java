package FileHandling;
import java.io.File;

public class Delete {
  public static void main(String [] args){
    try{
      File file = new File("text.txt");
      if(file.delete()){
        System.out.println("file successfill deleted");
      }
      else{
        System.out.println("file does not exist");
      }
    }catch(Exception e){
      System.out.println("error");
    }
  }
}
