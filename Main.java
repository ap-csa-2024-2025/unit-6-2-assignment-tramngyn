import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int len = sc.nextInt();

    int[] arr = new int[len];
    System.out.println("Enter values");
    for (int i = 0; i < len; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Contains negative: " + containsNeg(arr));
  }

  public static boolean containsNeg(int[] array)
  {
    // Implement Problem 1 here
    return 0;
  }
}
