package ic.doc.templatemethod;

public class FibonacciSequence extends SequenceCommon {

  //only term implementation differs from superclass
  //complete separately

  @Override
  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return term(i - 1) + term(i - 2);
  }
}
