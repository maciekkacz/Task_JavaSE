package Task7;

public class ShapeDrawer {
    public static void main(String[] args) {
        draw( 10 );


    }

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            drawSpaces( size - i );
            drawStars( size );
            System.out.println();

        }
    }


    private static void drawStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print( "x" );

        }
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print( " " );
        }
    }
}
