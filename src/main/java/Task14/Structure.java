package Task14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Structure {


    public Map<String, Integer> readProductsFromFile(String fileName) {
        List<String> fileContent = readDile(fileName);
        Map<String, Integer> result = new HashMap <>(  );
        for (String row : fileContent) {
            String[] split = row.split( ";" );
            result.put( split[0], Integer.valueOf( split[1] ) );
        }
        return result;
    }

    private List <String> readDile(String fileName) {
        try {
            return Files.readAllLines( Paths.get( fileName ) );
        } catch (IOException e) {
            System.err.println( "No found file" );
        }
        return new ArrayList <>(  );
    }
    public void printStars(Map<String, Integer> map) {
        map.forEach((k, v) -> {
            System.out.printf( "%30s (%d) %s\n ", k, v, getStars(v) );
        } );
    }

    private static String getStars(int number) {
        int round = ( number + 5) / 10;
        return String.join( " ", Collections.nCopies( round, "*" ) );
    }
}
