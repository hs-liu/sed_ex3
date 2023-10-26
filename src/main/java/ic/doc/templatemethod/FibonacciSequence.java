package ic.doc.templatemethod;

public class FibonacciSequence extends SequenceCommon implements Iterable<Integer> {

  //only term implementation differs from superclass
  //complete separately

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
