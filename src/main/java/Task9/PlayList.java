package Task9;

public class PlayList {




    public static int playlist(Song...songs) {
        int totalTime = 0;
        for (Song song : songs) {
            totalTime += song.getLength();
        }
        return totalTime;
    }


}
