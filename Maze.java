//Your JAVA Proram will come here//
//This is TCS National Qualifier Test Java Program Question's Answer//
import java.io.*;
import java.util.*;

public class Maze{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reverseNumber = 0, remainder = 0, divided = 0;
        remainder = num % 10;
        divided = num / 10;
        reverseNumber = (reverseNumber * 10) + remainder;
        System.out.println(reverseNumber);
        scanner.close();
  }
 }