package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected_i;
    double expected_f;

    expected_i = 5;
    assertEquals(expected_i, calculate.sum(2, 3));
    expected_i = 15;
    assertEquals(expected_i, calculate.sum_continue(1, 5));
    expected_i = 25;
    assertEquals(expected_i, calculate.sum_odd(1, 10));
    expected_i = 30;
    assertEquals(expected_i, calculate.sum_even(1, 10));
    expected_f = 3.5;
    assertEquals(expected_f, calculate.average(1, 6), 0);
    expected_f = 5.5;
    assertEquals(expected_f, calculate.average_continue(1, 10), 0);
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", calculate.sentens1(2, 3));
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", calculate.sentens2(1, 10));
    assertEquals("Sum of odd of1 to 10 is 25. Sum of even is 30.", calculate.sentens1(1, 10));
  }
}
