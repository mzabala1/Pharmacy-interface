import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FarmaciaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FarmaciaTest
{
    /**
     * Default constructor for test class FarmaciaTest
     */
    public FarmaciaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void FarmaciaTest()
    {
        Farmacia farmacia1 = new Farmacia();
        assertNotNull(farmacia1.getMedicamentos());
    }
    
    @Test
    public void FarmaciaTest2()
    {
        Farmacia farmacia2 = new Farmacia();
        assertNotNull(farmacia2.getMedicamentos());
    }
}
