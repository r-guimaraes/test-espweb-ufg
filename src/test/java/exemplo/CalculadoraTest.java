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
    System.out.println("@var frase_inicial deve retornar nula >> " + nulo);
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

  @Test
  public void testFatorial() {
    assertThat("Fatorial de 0 deve retornar 1", c.fatorial(0), is(1));
    assertThat("Fatorial de 4 deve retornar 24",c.fatorial(4), is(24));
    assertThat("Fatorial de 5 deve retornar 120",c.fatorial(5), is(120));
  }
  
}
