import java.util.Scanner;

class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the integer: ");
    int integer = in.nextInt();

    int mode = 0;
    int maxcount = 0;

    int[] list = new int[integer];
    
    for (int i = 0; i<integer; i++)
    {
      int number = in.nextInt();
      list[i] = number;
      int count = 0;
      for (int j = 0; j<integer; j++)
      {
        if (list[j] == list[i])
        {
          count+=1;
        }
        if (count > maxcount)
        {
          maxcount = count;
          mode = list[i];
        }
      }
    }
    System.out.println(mode);
    in.close();
  }
}
