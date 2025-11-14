import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;

public class ExceptionsDemo{
  public static void show(){
    sayHello(null);
  }
  public static void sayHello(String name){
    System.out.println(name.toUpperCase());
  }
}