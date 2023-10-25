package ic.doc.strategy;

import java.util.Iterator;

//super class that implements the interface
//its subclassess need to implement the interface methods
public abstract class CommonSequence implements TermInterface{

  @Override
  //abstract: the detail implementation complete in subclasses
  public abstract int term(int i);

  //iterator nested class, used by both subclasses, implemented in superclass
  //subclasses do not need to overwrite
  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }

}
