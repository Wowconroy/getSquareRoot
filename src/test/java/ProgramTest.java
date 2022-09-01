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
}