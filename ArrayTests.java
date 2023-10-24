import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {48, 65};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{65, 48}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.00);

    double[] input2 = {5.0, 4.0, 3.0, 2.0, 1.0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input2), 0.00);
  }
}
