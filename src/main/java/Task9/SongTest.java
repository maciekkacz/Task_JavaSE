package Task9;

public class SongTest {
    public static void main(String[] args) {

        Song song1 = new Song( "Ona lubi mnie", 360 );
        Song song2 = new Song( "Zielone Gitary", 420 );
        Song song3 = new Song( "ALA Ala", 500 );
        int playlist = PlayList.playlist( song1, song2, song3 );
        System.out.println( "Songs time " + playlist);
    }
}
