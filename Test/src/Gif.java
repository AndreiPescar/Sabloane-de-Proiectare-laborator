
public class Gif {
	String Titlu;
	Number Dimensiune;
	
	public Gif(String Titlu) {
        this.Titlu = Titlu;
    }

    public Gif(String Titlu, Number Dimensiune) {
        this.Titlu = Titlu;
        this.Dimensiune = Dimensiune;
    }

    public void print(){
        System.out.println("Playlist: " + Titlu);
        System.out.println("Playlist: " + Dimensiune);
    }
    
    public static void add(Gif newGif) {
		Gif.add(newGif);
	}
}