package Task15;

import java.util.Comparator;
import java.util.List;

public class MoveTest {
    public static void main(String[] args) {
        MoveDatabase moveDatabase = new MoveDatabase();

        List<Movie> moviesList = moveDatabase.createMovieeList();
        Comparator<Movie> sortAlgorithm = MoveDatabase.getSortAlgorithm();
        moviesList.sort(sortAlgorithm);
        moveDatabase.printMovies2( moviesList );
    }
}
