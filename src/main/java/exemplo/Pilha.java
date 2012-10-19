package exemplo;

/**
 *
 * @author rodrigo
 */
class Pilha {
  public Pilha() {
    pilha = new String[100];
    next_index = 0;
  }

  public String pop() {
    return pilha[--next_index];
  }

  public void delete(int n) {
    next_index -= n;
  }

  public void push(String aString) {
    pilha[next_index++] = aString;
  }

  public String top() {
    return pilha[next_index - 1];
  }

  public void checkInvariant() throws Exception {
    if (!(next_index >= 0 && next_index < pilha.length)) {
      throw new Exception("next_index fora de cobertuda: " + next_index + " para o tamanho da pilha "
          + pilha.length);
    } else {
      System.out.println("Tá ok ..");
    }
  }

  private int next_index;

  private String[] pilha;
}