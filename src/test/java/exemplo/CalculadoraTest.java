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
    String nulo = d.getFraseInicial();
    System.out.println("@var fraseInicial deve retornar nula >> " + nulo);
    assertNull(nulo);
  }

  @Test
  public void testDividir() {
    Integer result = c.dividir(30, 15);
    assertThat(result, is(2));
  }

  @Test
  public void testMultiplicar() {
    Integer result = c.multiplicar(20, 20);
    assertThat(result, is(not(401)));
    assertThat(result, is(400));
  }

  @Test
  public void testSubtratir() {
    Integer result = c.subtratir(4,3);
    Integer result2 = c.subtratir(result, 50);
    
    assertTrue("Testando metodo subtração \n", result.equals(1));
    assertTrue("Testando metodo subtração com resultado anterior \n", result2 == -49);    
  }

   /*
    * Testa diferença do caracter de retorno na igualdade de strings
    * Checa se nome é exibido conforme passado 
    */  
  @Test
  public void testComprimentaUsuarioCalculadora() {
   String str1 = c.comprimentaUsuarioCalculadora("Auri");
   String str2 = "Obrigado por usar a calculadora de Testes UFG, Auri";
   String str3 = "Obrigado por usar a calculadora de Testes UFG, Auri\n";
   assertTrue(str1.equals(str2));   
   assertTrue(str1.startsWith("O"));   
   assertTrue(str1.contains("Auri"));   
   assertFalse(str1.contains("auri"));
   
   assertFalse(str1.equals(str3));
  }

  
  /*
   * Análise de Valor Limite
   */
  @Test
  public void testFatorial() {
    assertThat("Fatorial de 0 deve retornar 1", c.fatorial(0), is(1));
    assertThat("Fatorial de 4 deve retornar 24",c.fatorial(4), is(24));
    assertThat("Fatorial de 5 deve retornar 120",c.fatorial(5), is(120));
    
    assertThat("Fatorial de inteiro negativo não deve existir.",c.fatorial(-5), is(not(-120)));
    assertThat("Fatorial de inteiro negativo deve retornar zero",c.fatorial(-5), is(0));    
  }
  
  @Test
  public void testELogico() {
    assertTrue(c.eLogico(true, true));
    assertFalse(c.eLogico(false, true));
    assertFalse(c.eLogico(true, false));
    assertFalse(c.eLogico(false, false));
  }
  @Test
  public void testOuLogico() {
    assertTrue(c.ouLogico(true, true));
    assertTrue(c.ouLogico(false, true));
    assertTrue(c.ouLogico(true, false));
    assertFalse(c.ouLogico(false, false));
  }
  
  @Test
  public void testParOuImpar() {
    assertThat(c.ParOuImpar(2),is("par"));
    assertThat(c.ParOuImpar(-44),is("par"));
    assertThat(c.ParOuImpar(110),is("par"));
    assertThat(c.ParOuImpar(3),is("ímpar"));
    assertThat(c.ParOuImpar(45),is("ímpar"));
    assertThat(c.ParOuImpar(-89),is("ímpar"));
  }
    
  
}
