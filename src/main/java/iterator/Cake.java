package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cake extends CakeComponent {

    private List<CakeComponent> toppings;

    private Iterator<CakeComponent> iterator;

    private Integer weight;

    private Integer price;

    private String description;

    public Cake(Integer weight, Integer price, String description) {
        this.toppings = new ArrayList<>();
        this.weight = weight;
        this.price = price;
        this.description = description;
        this.iterator = null;
    }

    @Override
    void add(CakeComponent component) {
        toppings.add(component);
    }

    @Override
    void remove(CakeComponent component) {
        toppings.remove(component);
    }

    @Override
    CakeComponent getChild(int index) {
        return toppings.get(index);
    }

    @Override
    Iterator<CakeComponent> createIterator() {
        if (iterator == null) {
            iterator = new CakeIterator(toppings.iterator());
        }
        return iterator;
    }

    @Override
    Integer getWeight() {
        while (iterator.hasNext()) {
            weight = weight + iterator.next().getWeight();
        }
        return weight;
    }

    @Override
    Integer getPrice() {
        while (iterator.hasNext()) {
            price = price + iterator.next().getPrice();
        }
        return price;
    }

    @Override
    String getDescription() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(description);
        while (iterator.hasNext()) {
            sb.append(" ");
            sb.append(iterator.next().getDescription());
        }
        return sb.toString();
    }
}
