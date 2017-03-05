

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MedicamentoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MedicamentoTest
{
    /**
     * Default constructor for test class MedicamentoTest
     */
    public MedicamentoTest()
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
    public void MedicamentTest()
    {
        Medicamento medicame1 = new Medicamento("Propofol", "Anestesico", "22", "1C");
        assertEquals("1C", medicame1.getCasillero());
        assertEquals("Propofol", medicame1.getNombre());
        assertEquals("Anestesico", medicame1.getTipo());
        assertEquals("22", medicame1.getUbicacion());
    }
    
    
    @Test
    public void MedicamentTest2()
    {
        Medicamento medicame1 = new Medicamento("Morfina", "Analgesico", "13", "1B");
        assertEquals("1B", medicame1.getCasillero());
        assertEquals("Morfina", medicame1.getNombre());
        assertEquals("Analgesico", medicame1.getTipo());
        assertEquals("13", medicame1.getUbicacion());
    }
}

