import java.util.ArrayList;
import java.util.List;

public class book {
    String title;

    List<author> authors;
    List<chapter> chapters;
    public book() {
    }

    public book(String title) {
        this.title = title;
        authors = new ArrayList<>();
        chapters = new ArrayList<>();
    }

    public void addAuthor(author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", authors=");
        authors.forEach(author::print);
        System.out.println("\n chapters=");
        chapters.forEach(chapter::print);
        System.out.println('}');
    }

    public int createChapter(String chapter) {
        chapter chp = new chapter(chapter);
        chapters.add(chp);
        return chapters.size()-1;
    }

    public chapter getChapter(int indexChapter) {
        return chapters.get(indexChapter);
    }
}