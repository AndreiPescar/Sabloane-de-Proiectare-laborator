public class author {
    private String name;

    public author() {
    }

    public author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println( "Author{" +
                "name='" + name + '\'' +
                '}');
    }

}