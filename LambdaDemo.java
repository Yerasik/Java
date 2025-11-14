


public class LambdaDemo{
  public static String prefix = "-";
  public static void show(){
    greet(System.out::println);    
  }
  public static void greet ( Printer printer ){
    printer.print("Hello World");
  }
}