package exemplo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Sample JUnit-4-style test suite.
 * 
 * @author rodrigo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({exemplo.VectorsJUnit4Test.class,exemplo.UtilsJUnit4Test.class})
public class JUnit4TestSuite {

}