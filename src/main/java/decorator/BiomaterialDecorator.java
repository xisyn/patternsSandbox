package decorator;

public abstract class BiomaterialDecorator extends Examination {

    protected Examination examination;

    public abstract String getDescription();

    @Override
    public Boolean getResult() {
        if (examination.getResult()) {
            return true;
        } else {
            return result;
        }
    }

}
