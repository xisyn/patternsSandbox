package decorator;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Медицинское исследование
 */
@Data
public abstract class Examination {

    /**
     * Результат исследования
     */
    protected Boolean result;

    /**
     * Стоимость исследования
     */
    protected BigDecimal cost;

    /**
     * Описание/состав исследования
     */
    protected String description;

    public Examination() {
        this.result = false;
    }

    public abstract BigDecimal getCost();

}
