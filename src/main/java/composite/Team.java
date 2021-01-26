package composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Команда
 * Composite
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Team extends TeamComponent {

    private List<TeamComponent> teamComponents;

    private String description;

    private Double spendTime;

    private BigDecimal cost;

    public Team(String description, Double spendTime, BigDecimal cost) {
        this.description = description;
        this.spendTime = spendTime;
        this.cost = cost;
        teamComponents = new ArrayList<>();
    }

    @Override
    public void add(TeamComponent teamComponent) {
        teamComponents.add(teamComponent);
    }

    @Override
    public void remove(TeamComponent teamComponent) {
        teamComponents.remove(teamComponent);
    }

    @Override
    public TeamComponent getChild(int index) {
        return teamComponents.get(index);
    }

    public String getDescription() {
        return teamComponents.stream()
                             .map(TeamComponent::getDescription)
                             .collect(Collectors.joining(", "));
    }
}
