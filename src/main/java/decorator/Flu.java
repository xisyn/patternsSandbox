package decorator;

import java.math.BigDecimal;

/**
 * Тест на грипп
 */
public class Flu extends Examination {

    public Flu() {
        this.description = "Тест на грипп";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(950);
    }
}
