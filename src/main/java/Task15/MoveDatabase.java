package Task15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MoveDatabase {


    public List <Movie> createMovieeList() {
        List <Movie> movies = new ArrayList <>();
        movies.add( new Movie( "Jumanji", "Johnston Joe", 1995, 6.8 ) );
        movies.add( new Movie( "The Shawshank Redemption", "Johnston Joe", 1994, 8.75 ) );
        movies.add( new Movie( "The Green Mile", "Darabont Frank", 1999, 8.61 ) );
        movies.add( new Movie( "Spider Man", "Raimi Sam", 2002, 6.7 ) );
        movies.add( new Movie( "Transformers", "Bay Michael", 2007, 7.3 ) );
        movies.add( new Movie( "Alien", "Scott Ridley", 1979, 7.8 ) );
        movies.add( new Movie( "Home Alone", "Columbus Chris", 1979, 7.1 ) );

        return movies;
    }

    /*public void printMovies(List <Movie> movies) {
        for (Movie movie : movies) {
            System.out.println( movie );
        }
    }*/

    public void printMovies2(List <Movie> movies) {
        movies.forEach( System.out::println );
    }
    private static void printSortingAlgorithms() {
        MovieComparator[] comparators = MovieComparator.values();
        for (MovieComparator comparator : comparators) {
            System.out.printf("\t>%s\n", comparator.getCriteria());
        }
    }
    public static Comparator<Movie> getSortAlgorithm() {
        System.out.println("Wybierz kryterium sortowania:");
        printSortingAlgorithms();
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        MovieComparator algorithm = null;
        try {
            algorithm = MovieComparator.convert(userInput);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        return algorithm != null ? algorithm.getComparator() : null;
    }

}

