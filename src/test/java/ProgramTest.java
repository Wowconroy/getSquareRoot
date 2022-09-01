import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProgramTest {

    private Program underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Program();
    }

    @Test
    public void tryToGetSquareRoot() {
        int expected = underTest.getSquareRoot(5);

        Assert.assertEquals(expected, 2);
    }

    @Test
    public void tryToGetSquareRootWithMathFunction() {
        int expected = underTest.getSquareRoot(9);
        int actual = (int) Math.sqrt(9);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tryToGetWrongSquareRoot() {
        int unexpected = underTest.getSquareRoot(16);

        Assert.assertNotEquals(3, unexpected);
    }

    @Test
    public void tryToGetSquareRootWithMultipleValues() {
        int [] expectedArray = {1, 2, 3, 4, 5};
        int [] actualArray = new int[5];

        int squareRootOne = underTest.getSquareRoot(1);
        actualArray[0] = squareRootOne;

        int squareRootTwo = underTest.getSquareRoot(6);
        actualArray[1] = squareRootTwo;

        int squareRootThree = underTest.getSquareRoot(11);
        actualArray[2] = squareRootThree;

        int squareRootFour = underTest.getSquareRoot(21);
        actualArray[3] = squareRootFour;

        int squareRootFive = underTest.getSquareRoot(26);
        actualArray[4] = squareRootFive;

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void tryToGetValueFromZero() {
        int expected = underTest.getSquareRoot(0);

        Assert.assertEquals(0, expected);
    }
}