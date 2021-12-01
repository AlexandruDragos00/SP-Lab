import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String url;
    private Dimension dim = new Dimension(400, 400);

    public Image(String url) {
        this.url = url;

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image " + url);
    }

    public String url() {
        return this.url;
    }

    public Dimension dim() {
        return this.dim;
    }
}