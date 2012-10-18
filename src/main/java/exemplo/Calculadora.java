package exemplo;

/**
 *
 * @author rodrigo
 */
public class Calculadora {

  Integer num1, num2;
  String frase_inicial = "Frase inicial da Classe Calculadora";

  /**
   * 
   * @return
   */
  public Integer getnum2() {
    return num2;
  }

  /**
   * 
   * @return
   */
  public String getFrase_inicial() {
    return frase_inicial;
  }

  /**
   * 
   * @param frase_inicial
   */
  public void setFrase_inicial(String frase_inicial) {
    this.frase_inicial = frase_inicial;
  }

  /**
   * 
   */
  public void anulaFraseInicial() {
    this.frase_inicial = null;
  }

  /**
   * 
   * @param num2
   */
  public void setnum2(Integer num2) {
    this.num2 = num2;
  }

  /**
   * 
   * @return
   */
  public Integer getnum1() {
    return num1;
  }

  /**
   * 
   * @param num1
   */
  public void setnum1(Integer num1) {
    this.num1 = num1;
  }

  /**
   * 
   * @param num1
   * @param num2
   */
  public Calculadora(Integer num1, Integer num2) {
    setnum2(num2);
    setnum1(num1);
  }

  /**
   * 
   */
  public Calculadora() {
  }

  /**
   * 
   * @param num1
   * @param num2
   * @return
   */
  public Integer somar(Integer num1, Integer num2) {
    return num1 + num2;
  }

  /**
   * 
   * @param num1
   * @param num2
   * @return
   */
  public Integer dividir(Integer num1, Integer num2) {
    return num1 / num2;
  }

  /**
   * 
   * @param num1
   * @param num2
   * @return
   */
  public Integer multiplicar(Integer num1, Integer num2) {
    return num1 * num2;
  }

  /**
   * 
   * @param num1
   * @param num2
   * @return
   */
  public Integer subtratir(Integer num1, Integer num2) {
    return num1 - num2;
  }

  /**
   * 
   * @param nome
   * @return
   */
  public String comprimentaUsuarioCalculadora(String nome) {
    return "Obrigado por usar a calculadora de Testes UFG, " + nome + "\n";
  }

  /**
   * 
   * @param x
   * @return
   */
  public Integer fatorial(Integer x) {
    if (x < 0) return 0;
    else if (x == 0) return 1;
    else return multiplicar(x,fatorial(x - 1));    
  }
} // class
