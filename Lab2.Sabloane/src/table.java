public class table {
    private String title;

    public table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println( "Table{" +
                "title='" + title + '\'' +
                '}');
    }
}