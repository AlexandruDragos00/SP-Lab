import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private List<Element> children;
    private String title;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Section" + title);
        children.forEach(Element::print);
    }

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);

    }

    public Element get(int index) {
        return children.get(index);

    }

}
