package conversor;

/**
 *
 * @author rodrigo
 */
public interface Temperatura {

  public double getValor();

  public void setValor(double value) throws Exception;

  public double getCONGELAR();

  public double getFERVER();

  public double getZEROABSOLUTO();
}