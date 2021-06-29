/*
Print the number of numbers in the previous line for the given number of lines.

Sample input: 5
Sample output: 1
               1 1
               2 1
               1 2 1 1
               1 1 1 2 2 1
*/
package pattern.numofnum;
import java.util.Scanner;
public class Test {
  public static void main(String [] abc){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number of lines: ");
    int n= s.nextInt();
    new NumOfNum().start(n);
  }
}
