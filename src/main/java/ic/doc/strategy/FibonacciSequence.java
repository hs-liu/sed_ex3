package ic.doc.strategy;

public class FibonacciSequence extends CommonSequence {

  @Override
  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    if (i < 2) {
      return 1;
    }
    return term(i - 1) + term(i - 2);
  }
}
