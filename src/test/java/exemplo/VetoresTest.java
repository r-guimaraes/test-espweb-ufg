package exemplo;

import exemplo.Vetores;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class VetoresTest {

    public VetoresTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of equal method, of class VetoresTest.
     */
    @Test
    public void equalsCheck() {
        System.out.println("* VetoresTest: equalsCheck()");
        assertTrue(Vetores.equal(new int[]{}, new int[]{}));
        assertTrue(Vetores.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vetores.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(Vetores.equal(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertTrue(Vetores.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vetores.equal(new int[]{}, new int[]{0}));
        assertFalse(Vetores.equal(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vetores.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(Vetores.equal(new int[]{0, 0, 0}, new int[]{0, 0}));
        assertFalse(Vetores.equal(new int[]{0, 0}, new int[]{0}));
        assertFalse(Vetores.equal(new int[]{0}, new int[]{}));

        assertFalse(Vetores.equal(new int[]{0, 0, 0}, new int[]{0, 0, 1}));
        assertFalse(Vetores.equal(new int[]{0, 0, 0}, new int[]{0, 1, 0}));
        assertFalse(Vetores.equal(new int[]{0, 0, 0}, new int[]{1, 0, 0}));
        assertFalse(Vetores.equal(new int[]{0, 0, 1}, new int[]{0, 0, 3}));
    }

    /**
     * Test of scalarMultiplication method, of class VetoresTest.
     */
    @Test
    public void ScalarMultiplicationCheck() {
        System.out.println("* VetoresTest: ScalarMultiplicationCheck()");
        assertEquals(0, Vetores.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vetores.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vetores.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, Vetores.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));
        assertEquals(100, Vetores.scalarMultiplication(new int[]{6, 8}, new int[]{6, 8}));
    }
}