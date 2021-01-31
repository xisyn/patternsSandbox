package iterator;

import org.junit.Test;

import java.util.Iterator;

public class CakeComponentTest {

    @Test
    public void name() {
        CakeComponent cake = new Cake(5, 10, "тортик");
        CakeComponent chok = new Chocolate(1, 2, "шоколад");
        CakeComponent cream = new WhippedCream(1, 3, "крем");

        cake.add(chok);
        cake.add(cream);

        Iterator<CakeComponent> iterator = cake.createIterator();

        System.out.println(cake.getPrice());
        System.out.println(cake.getWeight());
        System.out.println(cake.getDescription());
    }
}