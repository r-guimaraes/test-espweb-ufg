package conversor;

/**
 *
 * @author rodrigo
 */
public class ConversorFahrenheitCelsius {

  public ConversorFahrenheitCelsius() {
  }

  public ConversorFahrenheitCelsius(double fahrenteit, double celsius) {
  }

  public Temperatura convert(Temperatura temp) throws Exception {
    if (temp instanceof GrausCelsius) {
      return convertToFahrenheit(temp);
    } else {
      return convertToCelsius(temp);
    }
  }

  private Temperatura convertToFahrenheit(Temperatura celsius) throws Exception {
    TempFahrenheit f = new TempFahrenheit();
    double cvalor = celsius.getValor();
    double fvalor = 1.8 * cvalor + f.getCONGELAR();  
    f.setValor(fvalor);
    return f;
  }

  private Temperatura convertToCelsius(Temperatura fahrenheit) throws Exception {
    GrausCelsius c = new GrausCelsius();
    double fvalor = fahrenheit.getValor();
    double cvalor = (5 * fvalor - 5 * fahrenheit.getCONGELAR())/9;  
    c.setValor(cvalor);
    return c;
  }
}
