package exemplo;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author rodrigo
 */
public class LivroTest {

  private static Livro l;
  Livro bestSeller1 = new Livro("Steve Jobs", "Walter Isaacson", "Companhia das Letras", 2012);
  Livro bestSeller2 = new Livro("Before I Go to Sleep: A Novel", "S.J.Watson", "Harper Paperbacks", 2012);
  Livro bestSeller3 = new Livro("What It Is Like to Go to War", "Karl Marlantes", "Kindle Edition", 2011);

  public LivroTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    l = new Livro();
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    l = null;
  }

  /**
   * Test of MontaBestSellers method, of class
   * Livro.
   */
  @Test
  public void testMontaBestSellers() {
    ArrayList<Livro> listaBS = l.MontaBestSellers(bestSeller1, bestSeller2, bestSeller3);
    assertTrue("Confere se método retorna lista de arrays corretamente", listaBS.getClass() == ArrayList.class);
    assertNotNull(listaBS);
    assertTrue("Confere se o terceiro best seller está correto", listaBS.lastIndexOf(bestSeller3) == 2);
  }
  
  @Test
  public void testExibeBestSellers() {
    ArrayList<Livro> listaBS = l.MontaBestSellers(bestSeller1, bestSeller2, bestSeller3);   
    assertTrue("Método retorna itens passados", l.ExibeBestSellers(listaBS) == 3);
  }
}
