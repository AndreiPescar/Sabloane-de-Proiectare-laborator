import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	
    private List<Playlist> p;
	private Object Playlist;

    public MediaPlayer(String Titlu){
        this.Playlist = new ArrayList<>();
    }
   
    public void print(){
        System.out.println("Playlist: ");
        for(Playlist i : p){
            i.print();
        }
        System.out.println();
    }

	public void add(Playlist p) {
		((MediaPlayer) Playlist).add(p);
		
	}

}
