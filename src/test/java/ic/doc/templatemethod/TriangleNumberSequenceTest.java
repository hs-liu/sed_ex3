package ic.doc.templatemethod;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleNumberSequenceTest {

    final TriangleNumberSequence sequence = new TriangleNumberSequence();

    @Test
    public void definesFirstTwoTermsToBeOne() {

      assertThat(sequence.term(0), is(1));
      assertThat(sequence.term(1), is(3));
    }

    @Test
    public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {

      assertThat(sequence.term(2), is(6));
      assertThat(sequence.term(3), is(10));
      assertThat(sequence.term(4), is(15));
      System.out.println(sequence.iterator().next());
      System.out.println(sequence.iterator().next());

    }

    @Test
    public void isUndefinedForNegativeIndices() {

      try {
        sequence.term(-1);
        fail("should have thrown exception");
      } catch (IllegalArgumentException e) {
        assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
      }
    }

    @Test
    public void canBeIteratedThrough() {
      assertThat(sequence, beginsWith(1, 3, 6, 10, 15));
    }
}
