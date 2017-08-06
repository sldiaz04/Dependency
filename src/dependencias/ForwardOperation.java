package dependencias;

public class ForwardOperation implements Operation {

    private final Browser browser;

    public ForwardOperation(Browser browser) {
        this.browser = browser;
    }
    
    @Override
    public String name() {
        return "forward";
    }

    @Override
    public void execute() {
        browser.forward();
    }
}
