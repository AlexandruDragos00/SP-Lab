public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public String getText() {
        return text;
    }


    @Override
    public void print() {
        if(alignStrategy == null){
            System.out.println(text);
        } else {
            alignStrategy.render(this);
        }
    }
}
