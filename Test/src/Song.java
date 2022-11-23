
public class Song {
	String Titlu;
	Number Dimensiune;
	
	public Song(String Titlu) {
        this.Titlu = Titlu;
    }

    public Song(String Titlu, Number Dimensiune) {
        this.Titlu = Titlu;
        this.Dimensiune = Dimensiune;
    }

    public void print(){
        System.out.println("Playlist: " + Titlu);
        System.out.println("Playlist: " + Dimensiune);
    }
    public static void add(Song newSong) {
		Song.add(newSong);
		
	}
}