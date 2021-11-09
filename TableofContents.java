public class TableofContents implements Element {

    private String content;

    TableofContents(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Content " + this.content);
    }

}
