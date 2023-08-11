package designpattern.decorator;

public class BaseEvaluator implements Criteria {

    private Criteria wrapper;

    BaseEvaluator(Criteria wrap) {
        this.wrapper = wrap;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return this.wrapper.evaluate(theApp);
    }
}