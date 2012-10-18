package conversor;

/**
 *
 * @author rodrigo
 */
public class ConversorPolegadasCentimetros {

  public ConversorPolegadasCentimetros() {
  }
  public Double polegada, cm;

  public Double getCm() {
    return cm;
  }

  public void setCm(Double cm) {
    this.cm = cm;
  }

  public Double getPolegada() {
    return polegada;
  }

  public void setPolegada(Double polegada) {
    this.polegada = polegada;
  }

  public Double convertePolegadasParaCentimetros(Double polegada) {
    Double valor = polegada * 2.54;
    System.out.println(polegada + " polegadas equivalem a " + valor + " centímetros.");
    return valor;
  }

  public Double converteCentimetrosParaPolegadas(Double cm) {
    Double valor = cm / 2.54;
    System.out.println(cm + " centímetros equivalem a " + valor + " polegadas.");
    return valor;
  }
}
