package iterator;

import java.util.Iterator;

public abstract class CakeComponent {

    void add(CakeComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(CakeComponent component) {
        throw new UnsupportedOperationException();
    }

    CakeComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    private Integer weight;

    private Integer price;

    private String description;

    abstract Integer getWeight();

    abstract Integer getPrice();

    abstract String getDescription();

    abstract Iterator<CakeComponent> createIterator();


}
