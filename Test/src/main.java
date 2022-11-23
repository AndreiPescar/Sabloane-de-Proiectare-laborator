
public class main {

    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist ("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe", 20000));
        p.add(new Song("Simple things", 4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);
        
        Visitor v = new MediaSizeVisior();
        m.accept(v);
        v.printSizes();
    }
}
