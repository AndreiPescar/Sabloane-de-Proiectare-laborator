public class image {
    private String imageName;

    public image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println( "Image{" +
                "imageName='" + imageName + '\'' +
                '}');
    }
}