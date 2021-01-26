package composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * Тестировщик
 * Leaf
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Tester extends TeamComponent {

    private String description;

    private Double spendTime;

    private BigDecimal cost;

}
