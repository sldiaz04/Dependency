package dependencias;

public class BackOperation implements Operation {

    private final Browser browser;

    public BackOperation(Browser browser) {
        this.browser = browser;
    }
    
    @Override
    public String name() {
        return "back";
    }

    @Override
    public void execute() {
        browser.back();
    }
}
