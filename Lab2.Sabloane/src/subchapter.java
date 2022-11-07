import java.util.ArrayList;
import java.util.List;

public class subchapter {
    private String name;
    private List<paragraph> paragraphs;
    private List<image> images;
    private List<table> tables;




    public subchapter() {
    }

    public subchapter(String name) {
        this.name = name;
        paragraphs = new ArrayList<>();
        images = new ArrayList<>();
        tables = new ArrayList<>();
    }

    public void createNewParagraph(String name) {
        paragraph paragraph = new paragraph(name);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String name) {
        image image = new image(name);
        images.add(image);
    }

    public void createNewTable(String name) {
        table table = new table(name);
        tables.add(table);
    }

    public void print() {
        System.out.println( "SubChapter{" +
                "name='" + name + '\'' +
                ", paragraphs=");
        paragraphs.forEach(paragraph::print);
        System.out.println("\nimages=");
        images.forEach(image::print);
        System.out.println("\ntables=");
        tables.forEach(table::print);
        System.out.println('}');
    }
}