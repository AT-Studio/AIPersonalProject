public class Factorial {

  public static int factorial(int num) {
    if (num < 0) return -1;
    if (num == 1 || num == 0) return 1;
    return num * factorial(num - 1);
  }

}
