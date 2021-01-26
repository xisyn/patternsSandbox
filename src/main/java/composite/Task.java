package composite;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Задача для команды
 */
@Data
public class Task {

    private double time;

    private BigDecimal cost;

    private String description;
}
