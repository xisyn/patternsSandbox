package iterator;

import java.util.Iterator;
import java.util.Stack;

public class CakeIterator implements Iterator<CakeComponent> {

    Stack<Iterator<CakeComponent>> stack = new Stack<>();

    public CakeIterator(Iterator<CakeComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<CakeComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public CakeComponent next() {
        if (hasNext()) {
            Iterator<CakeComponent> iterator = stack.peek();
            CakeComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }
}
