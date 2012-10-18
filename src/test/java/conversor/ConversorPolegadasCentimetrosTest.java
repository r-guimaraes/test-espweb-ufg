/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author rodrigo
 */
public class ConversorPolegadasCentimetrosTest {

  public ConversorPolegadasCentimetrosTest() {
  }
  private static ConversorPolegadasCentimetros conv;

  @BeforeClass
  public static void setUpClass() throws Exception {
    conv = new ConversorPolegadasCentimetros();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    conv = null;
  }

  /**
   * Test of convertePolegadasParaCentimetros
   * method, of class
   * ConversorPolegadasCentimetros.
   */
  @Test
  public void testConvertePolegadasParaCentimetros() {
    assertTrue(conv.convertePolegadasParaCentimetros(42.00) == 106.68);
  }

  /**
   * Test of converteCentimetrosParaPolegadas
   * method, of class
   * ConversorPolegadasCentimetros.
   */
  @Test
  public void testConverteCentimetrosParaPolegadas() {
    assertTrue(conv.converteCentimetrosParaPolegadas(5.08) == 2);
  }
}
