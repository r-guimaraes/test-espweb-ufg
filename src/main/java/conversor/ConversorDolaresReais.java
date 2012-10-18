package conversor;

/**
 *
 * @author rodrigo
 */
public class ConversorDolaresReais {
  
  public ConversorDolaresReais() {}
  
  public Double dolares, reais;
  
  private static final Double COTACAO_DOLAR = 2.03;

  public Double getDolares() {
    return dolares;
  }

  public void setDolares(Double dolares) {
    this.dolares = dolares;
  }

  public Double getReais() {
    return reais;
  }

  public void setReais(Double reais) {
    this.reais = reais;
  }
  
  public Double converteDolaresParaReais(Double dolares) {    
    Double valor = COTACAO_DOLAR * dolares;    
    System.out.print("Com " + dolares + " dólares ");
    System.out.println("você tem o equivalente a " + valor + " reais.");
    return valor;
  }  
  
  public Double converteReaisParaDolares(Double reais) {    
    Double valor = reais / COTACAO_DOLAR;    
    System.out.print("Com " + reais + " reais ");
    System.out.println("você tem o equivalente a " + valor + " dólares.");
    return valor;
  }
  
  public static void main(String[] args) {
    new ConversorDolaresReais().converteDolaresParaReais(4.65);
    new ConversorDolaresReais().converteReaisParaDolares(4.06);
  }
  
} // class
