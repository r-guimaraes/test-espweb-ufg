package exemplo;

import exemplo.Utils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * 
 * @author rodrigo
 */
public class UtilsTest {

    public UtilsTest() {
    }
    
   Utils u = null;
    /**
     * Test initialization method. It is executed before each test method
     * of this test class. There may be multiple test initialization methods
     * - in such a case, all these methods are executed before each test method
     * but order of their execution is undefined. The name of the method is
     * irrelevant - the only mandatory attributes are:
     *   the {@code @Before} annotation,
     *   the {@code public} access modifier
     *   the {@void} return type and
     *   no arguments.
     */
    @Before
    public void setUp() {
        System.out.println("* UtilsTest: @Before method .. instanciando @var u ..");
        u = new Utils();
    }

    
    /**
     * Test shutdown method. It is executed after each test method
     * of this test class. There may be multiple test shutdown methods
     * - in such a case, all these methods are executed after each test method
     * but order of their execution is undefined. The name of the method is
     * irrelevant - the only mandatory attributes are:
     *   the {@code @After} annotation,
     *   the {@code public} access modifier
     *   the {@void} return type and
     *   no arguments.
     */
    @After
    public void tearDown() {
        System.out.println("* UtilsTest: @After method ... removendo @var u ..");
        u = null;
    }

    /**
     * Test of concatWords method, of class Utils.
     * Simple test method. It does not need to follow any naming conventions,
     * just the {@code @Test} annotation is important.
     */
    @Test
    public void helloWorldCheck() {
        System.out.println("* UtilsTest: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    /**
     * Test with timeout. If the testing routine does not finish in one second,
     * it is interrupted and the test fails. The timeout is declared by an
     * argument to the {@code @Test} annotation.
     * 
     */
        
    @Test(timeout = 2000)
    public void testWithTimeout() {
        System.out.println("* UtilsTest: test method 2 - testWithTimeout()");
        final int factorialOf = 81;
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    

    /**
     * Test of expected exception. If a given exception is not thrown during the
     * tested routine, the test fails. If the exception is thrown, the test
     * passes. The expected annotation is declared by an argument to the
     * {@code @Test} annotation.
     */
    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        System.out.println("* UtilsTest: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Test
    public void testPegaExtensao() {      
      assertTrue(u.pegaExtensao("foto01.jpg").equals(".jpg"));
    }

   
}