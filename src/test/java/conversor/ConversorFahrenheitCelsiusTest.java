package conversor;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author rodrigo
 */
public class ConversorFahrenheitCelsiusTest {
  
  public ConversorFahrenheitCelsiusTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Test
  public void testConvert() throws Exception {
    
    Temperatura t = new TempFahrenheit();  
        t.setValor(32);  
        ConversorFahrenheitCelsius tc = new ConversorFahrenheitCelsius();  
        Temperatura f = tc.convert(t);  
        assertTrue(f.getValor() == 0);  
  }  
}
