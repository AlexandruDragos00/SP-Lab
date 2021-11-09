import java.util.List;
import java.util.ArrayList;

public class Book extends Section {

    private List<Author> authors;

    public Book(String name) {
        super(name);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book ");
        System.out.println("Authors");
        super.print();
        authors.forEach(Author::print);
    }

}
