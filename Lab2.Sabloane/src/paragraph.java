public class paragraph {
    private String text;

    public paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println( "Paragraph{" +
                "text='" + text + '\'' +
                '}');
    }
}