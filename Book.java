import java.util.List;
import java.util.ArrayList;

public class Book {
    private String name;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String name) {
        this.name = name;
        this.chapters = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String name) {
        chapters.add(new Chapter(name));
        return chapters.size() - 1;

    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Book " + name);
        System.out.println("Authors");
        authors.forEach(Author::print);
        System.out.println("Chapters");
        chapters.forEach(Chapter::print);
    }

}
