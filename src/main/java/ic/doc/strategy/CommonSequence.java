package ic.doc.strategy;

import java.util.Iterator;

public abstract class CommonSequence implements TermInterface{

  @Override
  public abstract int term(int i);

  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    final public boolean hasNext() {
      return true;
    }

    @Override
    final public Integer next() {
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }

}
