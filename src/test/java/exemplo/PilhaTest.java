package exemplo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class PilhaTest {

  public void testEmpty() throws Exception {
    Pilha stack = new Pilha();

    stack.checkInvariant();
    stack.push("sample");
    stack.checkInvariant();

    assertEquals("sample", stack.pop());
    stack.checkInvariant();

    stack.delete(1);
    stack.checkInvariant();
  }
}
