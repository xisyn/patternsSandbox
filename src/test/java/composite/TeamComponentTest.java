package composite;

import org.junit.Test;

import java.math.BigDecimal;

public class TeamComponentTest {

    @Test
    public void devTeamTest() {

        TeamComponent team = new Team("команда", 10.0, new BigDecimal(100));
        TeamComponent allTeams = new Team("все", 10.0, new BigDecimal(100));
        allTeams.add(team);


        Developer developer = new Developer("dev", 1.0, new BigDecimal(1));
        team.add(developer);

        Owner owner = new Owner(allTeams);
        owner.printDescription();
    }
}