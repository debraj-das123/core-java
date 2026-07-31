package FileHandling;
import java.io.File;

import java.io.IOException;

public class FolderFiile {
  public static void main(String [] args){
    try{
      File folder = new File("MyFolder");
      if(! folder.exists()){
        folder.mkdir();
      }
      File fw = new File(folder, "text.txt");
      if(fw.createNewFile()){
        System.out.println("file was created");
        
      }
      else{
        System.out.println("file is already eaxist");
      }
    }catch(IOException e){
      System.out.println("error");
    }
  }
}
