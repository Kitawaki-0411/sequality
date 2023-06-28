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

  public int sum_odd(int x, int y) {
    int odd = 0;
    for (int i = x; i < y; i++) {
      if (i % 2 == 1) {
        odd += i;
      }
    }
    return odd;
  }

  public int sum_even(int x, int y) {
    int even = 0;
    for (int i = x; i < y + 1; i++) {
      if (i % 2 == 0) {
        even += i;
      }
    }
    return even;
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
    System.out
        .println(
            "Sum of odd of" + x + " to " + y + " is " + sum_odd(x, y) + ". Sum of even is " + sum_even(x, y) + ".");
  }
}
