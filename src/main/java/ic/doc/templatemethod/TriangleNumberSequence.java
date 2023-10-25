package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumberSequence extends SequenceCommon {

  //only term implementation differs from superclass
  //complete separately
  @Override
  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return (i + 1) * (i + 2) / 2;
  }
}
