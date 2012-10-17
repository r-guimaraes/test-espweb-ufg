package exemplo;

/**
 *
 * @author rodrigo
 */
public class Inscricao {
  private int preco; // em centavos de reais
  protected int periodo;
  
  public Inscricao(int p, int t) {
    this.preco = p;
    this.periodo = p;
  } // construtor
  
  // arredondando para o centavo mais próximo
  public double precoPorMes() {
    return (((double) preco / (double) periodo) * 100.0)/100.0;
  }
  
  //cancelar inscrição
  public void cancelaInscricao() {
    this.periodo = 0;
    System.out.println("Inscrição removida com sucesso!");
  }
  
  public static void main(String[] args) {
    Inscricao n = new Inscricao(200, 3);
    System.out.println(" Valor mensal >> " + n.precoPorMes());
  }
} // class
