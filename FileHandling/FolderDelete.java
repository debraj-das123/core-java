package FileHandling;
import java.io.File;
public class FolderDelete {
  public static void main(String[] args){
    try{
      File div = new File("MyFolder");
      if(div.delete()){
        System.out.println("folder is deleted");
      }
      else{
        System.out.println("file is not exist");
      }
    }catch(Exception e){
      System.out.println("error" + e.getMessage());

    }


  }
}
