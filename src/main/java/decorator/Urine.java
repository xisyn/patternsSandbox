package decorator;

import java.math.BigDecimal;

/**
 * Урина
 */
public class Urine extends BiomaterialDecorator {

    public Urine(Examination examination, Boolean result) {
        this.examination = examination;
        this.result = result;
    }

    @Override
    public BigDecimal getCost() {
        return examination.getCost().add(new BigDecimal(100));
    }

    @Override
    public String getDescription() {
        return examination.getDescription() + ", забор урины";
    }

}
