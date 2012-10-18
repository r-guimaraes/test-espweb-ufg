package conversor;

/**
 *
 * @author rodrigo
 */
public class TempFahrenheit implements Temperatura {

  private double value;
  private final double TEMPCONGELAR = 32;
  private final double TEMPFERVER = 212;
  private final double ZEROABSOLUTO = -459.4;

  public TempFahrenheit() {
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
    return getValor() + " F";
  }

  public boolean equals(TempFahrenheit other) {
    if (other instanceof TempFahrenheit) {
      return (other.getValor() == getValor());
    } else {
      return false;
    }
  }
}