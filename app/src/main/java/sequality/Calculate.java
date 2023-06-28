package sequality;

public class Calculate {

  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_continue(int x, int y) {
    int sum = 0;

    for (int i = x; i < y + 1; i++) {
      sum = sum(sum, i);
    }
    return sum;
  }

  public float average(int x, int y) {
    return (float) sum(x, y) / 2;
  }

  public float average_continue(int x, int y) {
    int sum = 0;
    for (int i = x; i < y + 1; i++) {
      sum = sum(sum, i);
    }
    return (float) sum / y + 1 - x;
  }

  public void sentens1(int x, int y) {
    System.out.println("Sum of " + x + " and " + y + " is " + sum(x, y) + ". Average is " + average(x, y) + ".");
  }

  public void sentens2(int x, int y) {
    System.out
        .println(
            "Sum of " + x + " to " + y + " is " + sum_continue(x, y) + ". Average is " + average_continue(x, y) + ".");
  }

  public void sentens3(int x, int y) {

  }
}
