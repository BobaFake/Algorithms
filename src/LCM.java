import java.util.*;

public class LCM {
  private static long lcm(int a, int b) {
    if (a < 0) {
      a *= -1;
    }
    if (b < 0) {
      b *= -1;
    }

    int gdc = gcd(a,b);

      return ((long) a * b) / gdc;
  }

  public static int gcd(int a, int b)  {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
