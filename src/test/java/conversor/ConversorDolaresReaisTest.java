package conversor;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author rodrigo
 */
public class ConversorDolaresReaisTest {

  public ConversorDolaresReaisTest() {
  }
  private static ConversorDolaresReais conv;

  @BeforeClass
  public static void setUpClass() throws Exception {
    conv = new ConversorDolaresReais();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    conv = null;
  }

  @Test
  public void testConverteDolaresParaReais() {
    assertThat("Testando conversão de dólares para reais ...", conv.converteDolaresParaReais(4.65), is(9.4395));
  }

  @Test
  public void testConverteReaisParaDolares() {
    assertThat("Testando conversão de reais para dólares ...", conv.converteReaisParaDolares(4.06), is(2.0));
  }
}
