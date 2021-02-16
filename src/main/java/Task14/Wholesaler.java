package Task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wholesaler {



    public void readFIle(String name) {
        try (
                var fileReader = new FileReader( name );
                var reader = new BufferedReader( fileReader );
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                System.out.println( nextLine );
                lines++;
            }
            System.out.println( "Ilość wierszy w pliku: " + lines );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



