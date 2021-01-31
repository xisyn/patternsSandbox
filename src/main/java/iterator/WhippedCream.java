package iterator;

import java.util.Iterator;

public class WhippedCream extends CakeComponent {

    private Integer weight;

    private Integer price;

    private String description;

    public WhippedCream(Integer weight, Integer price, String description) {
        this.weight = weight;
        this.price = price;
        this.description = description;
    }

    @Override
    Iterator<CakeComponent> createIterator() {
        return new NullIterator();
    }

    @Override
    Integer getWeight() {
        return weight;
    }

    @Override
    Integer getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return description;
    }
}
