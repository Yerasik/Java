import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ExceptionsDemo{
  public static void show(){
    FileReader reader = null;
    try {
      reader = new FileReader("file.txt");
      var value = reader.read();
      reader.close();
    } 
    catch(IOException e){
      System.out.println("Could not read data");
    }
    finally{
      if(reader!=null){
        try{
          reader.close();
        }
        catch(IOException e){
          System.out.println("Didn't close.");
        }
        
      }
      System.out.println("Closed");
    }
  }
  public static void sayHello(String name){
    System.out.println(name.toUpperCase());
  }
}