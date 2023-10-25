package ic.doc.strategy;

import java.util.Iterator;

public interface SequenceCommon {
  int term(int i);
  Iterator<Integer> iterator();

  class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      System.out.println(index);
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }

}
