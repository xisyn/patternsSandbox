package composite;

import java.math.BigDecimal;

/**
 * Component - определяет интерфейс для Composite и Leaf
 * Team и Employee 
 */
public abstract class TeamComponent {

    // Комбинационные методы
    void add(TeamComponent teamComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(TeamComponent teamComponent) {
        throw new UnsupportedOperationException();
    }

    TeamComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // Методы операций
    abstract Double getSpendTime();

    abstract BigDecimal getCost();

    abstract String getDescription();
}
