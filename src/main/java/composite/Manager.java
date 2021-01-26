package composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * Менеджер
 * Leaf
 */
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Manager extends TeamComponent {

    private String description;

    private Double spendTime;

    private BigDecimal cost;

}
