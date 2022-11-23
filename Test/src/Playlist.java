
public class Playlist {
	String Titlu;
	Number Dimensiune;
	
	public Playlist(String Titlu) {
        this.Titlu = Titlu;
    }

    public Playlist(String Titlu, Number Dimensiune) {
        this.Titlu = Titlu;
        this.Dimensiune = Dimensiune;
    }

    public void print(){
        System.out.println("Playlist: " + Titlu);
        System.out.println("Playlist: " + Dimensiune);
    }

	public static void add(Gif gif) {
		Gif.add(gif);
		
	}

	public void add(Song song) {
		Song.add(song);
		
	}

	public void add(Video video) {
		Video.add(video);
		
	}

	

}


