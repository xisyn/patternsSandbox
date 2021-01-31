package iterator;

import java.util.Iterator;

public class NullIterator implements Iterator<CakeComponent> {

    public boolean hasNext() {
        return false;
    }

    public CakeComponent next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
