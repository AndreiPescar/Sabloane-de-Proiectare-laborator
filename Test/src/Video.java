
public class Video {
	String Titlu;
	Number Dimensiune;
	
	public Video(String Titlu) {
        this.Titlu = Titlu;
    }

    public Video(String Titlu, Number Dimensiune) {
        this.Titlu = Titlu;
        this.Dimensiune = Dimensiune;
    }

    public void print(){
        System.out.println("Playlist: " + Titlu);
        System.out.println("Playlist: " + Dimensiune);
    }
    public static void add(Video newVideo) {
		Video.add(newVideo);
		
	}
}