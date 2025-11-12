import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;

public class Main{
  public static void main(String[] args){
    final int YEARS = 10;
    final double INTEREST = 0.2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("You Principal = ");
    int principal = scanner.nextInt();
    double mortgage = principal * Math.pow(100+INTEREST, YEARS);
    System.out.println("Your mortgage payments is " + mortgage);
  }
}