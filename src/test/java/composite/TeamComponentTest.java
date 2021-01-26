package composite;

import java.math.BigDecimal;
import org.junit.Test;

public class TeamComponentTest {

    @Test
    public void devTeamTest() {

        TeamComponent team = new Team("команда", 10.0, new BigDecimal(100));
        TeamComponent allTeams = new Team("все", 10.0, new BigDecimal(100));
        allTeams.add(team);

        Developer developer = new Developer("dev", 1.0, new BigDecimal(1));
        team.add(developer);
        Tester tester = new Tester("test", 2.0, new BigDecimal("0.5"));
        team.add(tester);

        Owner owner = new Owner(allTeams);
        owner.printDescription();
    }
}
