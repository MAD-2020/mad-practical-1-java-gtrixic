import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the integer to be multiplied: ");
    int integer = in.nextInt();

    int answer = integer *integer;

    System.out.println(answer);
    in.close();
  }
}
