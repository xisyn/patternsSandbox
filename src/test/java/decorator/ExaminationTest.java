package decorator;

import org.junit.Test;

public class ExaminationTest {

    @Test
    public void covidExaminationTest() {
        Examination examination = new Flu();
        examination = new Blood(examination, true);
        examination = new Urine(examination, false);

        System.out.println(examination.getCost());
        System.out.println(examination.getDescription());
        System.out.println(examination.getResult());
    }
}