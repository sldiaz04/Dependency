package dependencias;

public class ConsoleBrowser implements Browser {

    @Override
    public void back() {
        System.out.println("back");
    }

    @Override
    public void forward() {
        System.out.println("forward");
    }
}
