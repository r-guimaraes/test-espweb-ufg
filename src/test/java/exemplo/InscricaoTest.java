package exemplo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class InscricaoTest {
  
  public InscricaoTest() {
  }

  /**
   * Test of precoPorMes method, of class Inscricao.
   */
  @Test
  public void testPrecoPorMes() {
    System.out.println("Testando precoPorMes() .. valor deve retornar em centavos .. ");        
    Inscricao ins = new Inscricao(200, 2);
    assertTrue(ins.precoPorMes() == 1.0);    
  }

  /**
   * Test of cancelaInscricao method, of class Inscricao.
   */
  @Test
  public void testCancelaInscricao() {
    System.out.println("Testando cancelaInscricao ... deve zerar o valor de periodo");
    Inscricao instance = new Inscricao(200, 2);
    instance.cancelaInscricao();
    assertEquals(instance.periodo, 0);
  }

}
