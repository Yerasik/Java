import java.io.FileReader;
import java.io.FileNotFoundException;


public class ExceptionsDemo{
  public static void show(){
    try {
      var reader = new FileReader("file.txt");
      System.out.println("File Open");
    } catch(FileNotFoundException ex){
      System.out.println(ex.getMessage());
    }

   
  }
  public static void sayHello(String name){
    System.out.println(name.toUpperCase());
  }
}