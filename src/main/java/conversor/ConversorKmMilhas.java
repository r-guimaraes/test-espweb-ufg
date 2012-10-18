package conversor;

/**
 *
 * @author rodrigo
 */
public class ConversorKmMilhas {
  
  public ConversorKmMilhas() {}
  
  public Double km, milhas;  

  public Double getKm() {
    return km;
  }

  public void setKm(Double km) {
    this.km = km;
  }

  public Double getMilhas() {
    return milhas;
  }

  public void setMilhas(Double milhas) {
    this.milhas = milhas;
  }
  
  public Double converteKmParaMilhas(Double km) {
    Double valor = km / 1.609;
    System.out.println(km + " km equivale a " + valor + " milhas.");
    return valor;
  }
  
  public Double converteMilhasParaKm(Double milhas) {
    Double valor = 1.609 * milhas;
    System.out.println(milhas + " milhas equivale a " + valor + " km.");
    return valor;
  }  
} // class
