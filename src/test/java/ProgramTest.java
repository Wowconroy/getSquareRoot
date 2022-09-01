import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

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

    }
}