package decorator;

import java.math.BigDecimal;

/**
 * Кровь
 */
public class Blood extends BiomaterialDecorator {

    public Blood(Examination examination, Boolean result) {
        this.examination = examination;
        this.result = result;
    }

    @Override
    public BigDecimal getCost() {
        return examination.getCost().add(new BigDecimal(200));
    }

    @Override
    public String getDescription() {
        return examination.getDescription() + ", забор крови";
    }

}
