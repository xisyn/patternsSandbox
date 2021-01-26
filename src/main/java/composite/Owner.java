package composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Руководитель
 * Client
 */
@AllArgsConstructor
public class Owner {

    private TeamComponent allTeams;

    public void printDescription() {
        System.out.println(allTeams.getDescription());
    }
}
