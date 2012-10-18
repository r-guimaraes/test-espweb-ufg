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
public class ConversorMilhasKmTest {

  public ConversorMilhasKmTest() {
  }
  private static ConversorKmMilhas conv;

  @BeforeClass
  public static void setUpClass() throws Exception {
    conv = new ConversorKmMilhas();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    conv = null;
  }

  @Test
  public void testconverteKmParaMilhas() {
    // System.out.println(conv.converteKmParaMilhas(20.0));
    assertThat("Testando conversão de km para milhas ...", conv.converteKmParaMilhas(20.0), is(12.430080795525171));
  }

  @Test
  public void testconverteMilhasParaKm() {
    System.out.println(conv.converteMilhasParaKm(50.0));
    assertThat("Testando conversão de milhas para km ...", conv.converteMilhasParaKm(50.0), is(80.45));
  }
}
