package conversor;

/**
 *
 * @author rodrigo
 */
public class GrausCelsius implements Temperatura {

  private double value;
  private final double TEMPCONGELAR = 0;
  private final double TEMPFERVER = 100;
  private final double ZEROABSOLUTO = -273;

  public GrausCelsius() {
  }

  public double getValor() {
    return value;
  }

  public void setValor(double value) throws Exception {
    if (value < ZEROABSOLUTO) {
      throw new Exception("Não há temperatura abaixo do zero absoluto");
    } else {
      this.value = value;
    }
  }

  public double getCONGELAR() {
    return TEMPCONGELAR;
  }

  public double getFERVER() {
    return TEMPFERVER;
  }

  public double getZEROABSOLUTO() {
    return ZEROABSOLUTO;
  }

  @Override
  public String toString() {
    return getValor() + " C";
  }

  public boolean equals(GrausCelsius other) {
    if (other instanceof GrausCelsius) {
      return (other.getValor() == getValor());
    } else {
      return false;
    }
  }
}
