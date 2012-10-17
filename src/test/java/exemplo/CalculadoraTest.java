package exemplo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author rodrigo
 */
public class CalculadoraTest {

  private Calculadora c;

  public CalculadoraTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.c = new Calculadora();
  }

  /*
   * Utilizando Particionamento de Equivalência
   */
  @Test
  public void testSomar() {
    Integer result = c.somar(2, 3);
    assertTrue(result == 5);
  }

  @Test
  public void testAnulaFraseInicial() {
    Calculadora d = new Calculadora();
    d.anulaFraseInicial();
    String nulo = d.getFrase_inicial();
    System.out.println("Testando metodo para anular @var frase_inicial >> " + nulo);
    assertNull(nulo);
  }

  @Test
  public void testDividir() {
    Integer result = c.dividir(30, 15);
    assertThat(result, is(2));
  }

  @Test
  public void testMultiplicar() {
  }

  @Test
  public void testSubtratir() {
  }

  @Test
  public void testComprimentaUsuarioCalculadora() {
  }
}
