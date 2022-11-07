import java.util.ArrayList;
import java.util.List;

public class chapter {
    private String name;
    private List<subchapter> subChapters;

    public chapter() {
    }

    public chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapter) {
        subchapter subChp = new subchapter(subChapter);
        subChapters.add(subChp);
        return subChapters.size()-1;
    }

    public subchapter getSubChapter(int indexSubChapter) {
        return subChapters.get(indexSubChapter);
    }

    public void print() {
        System.out.print( "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=");
        subChapters.forEach(subchapter::print);
        System.out.println( '}');
    }

}