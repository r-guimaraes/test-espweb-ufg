package exemplo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rodrigo
 */
public class Calculadora {

  Integer num1, num2;
  String fraseInicial = "Frase inicial da Classe Calculadora";

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
  public String getFraseInicial() {
    return fraseInicial;
  }

  /**
   *
   * @param frase_inicial
   */
  public void setFraseInicial(String fraseInicial) {
    this.fraseInicial = fraseInicial;
  }

  /**
   *
   */
  public void anulaFraseInicial() {
    this.fraseInicial = null;
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
    return "Obrigado por usar a calculadora de Testes UFG, " + nome;
  }

  /**
   *
   * @param frst
   * @param scd
   * @return
   */
  public Boolean eLogico(Boolean frst, Boolean scd) {
    if (frst) {
      return scd;
    } else {
      return false;
    }
  } // eLogico

  public Boolean ouLogico(Boolean frst, Boolean scd) {
    if (frst) {
      return true;
    } else if (scd) {
      return true;
    } else {
      return false;
    }
  } // ouLogico

  public String ParOuImpar(int num) {
    if (num % 2 == 0) {
      return "par";
    } else {
      return "ímpar";
    }
  }

  /**
   *
   * @param x
   * @return Integer
   */
  public Integer fatorial(Integer x) {
    if (x < 0) {
      return 0;
    } else if (x == 0) {
      return 1;
    } else {
      return multiplicar(x, fatorial(x - 1));
    }
  }
} // class
