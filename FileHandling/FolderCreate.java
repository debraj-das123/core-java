package FileHandling;
 import java.io.File;
public class FolderCreate {
  public static void main(String [] args){
    try{
      File dir = new File("MyFolder");
      if(dir.mkdir()){
        System.out.println("folder is created");
      }
      else{
        System.out.println("folder already exixts");

      }
    }catch(Exception e){
      System.out.println("error" +e.getMessage());
    }
  }
  
}
