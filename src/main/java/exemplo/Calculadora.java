package exemplo;

/**
 *
 * @author rodrigo
 */
public class Calculadora {

  Integer num1, num2;
  
  String frase_inicial = "Frase inicial da Classe Calculadora";

  public Integer getnum2() {
    return num2;
  }

  public String getFrase_inicial() {
    return frase_inicial;
  }

  public void setFrase_inicial(String frase_inicial) {
    this.frase_inicial = frase_inicial;
  }
  
  public void anulaFraseInicial(){
    this.frase_inicial = null;
  }

  public void setnum2(Integer num2) {
    this.num2 = num2;
  }

  public Integer getnum1() {
    return num1;
  }

  public void setnum1(Integer num1) {
    this.num1 = num1;
  }

  public Calculadora(Integer num1, Integer num2) {
    setnum2(num2);
    setnum1(num1);
  }
  
  public Calculadora() {}
  
  public Integer somar(Integer num1, Integer num2) {  
    return num1 + num2;
  }
  public Integer dividir(Integer num1, Integer num2) {
    return num1/num2;
  }
  public Integer multiplicar(Integer num1, Integer num2) {
    return num1*num2;
  }
  public Integer subtratir(Integer num1, Integer num2) {
    return num1-num2;
  }
  
  public String comprimentaUsuarioCalculadora(String nome) {
    return "Obrigado por usar a calculadora de Testes UFG, " + nome + "\n";
  }
  
  
} // class
