package dependencias;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        ConsoleBrowser browser = new ConsoleBrowser();
        mainFrame.add(new BackOperation(browser));
        mainFrame.add(new ForwardOperation(browser));
    }
}
