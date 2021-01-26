package decorator;

import java.math.BigDecimal;

/**
 * Тест на корону
 */
public class Covid extends Examination {

    public Covid() {
        this.description = "Тест на корону";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(3500);
    }
}
