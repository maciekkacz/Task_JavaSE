package Task13;

import java.util.Scanner;

public class SharpeTest {

    private static final String RECTANGLE_NAME = "rectangle";
    private static final String SQUARE_NAME = "square";
    private static final String TREE_NAME = "tree";

    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        Drawable drawable = readAndCreate();
        if (!(drawable == null)) {
            drawable.draw();
        }



    }

    private static Drawable readAndCreate() {
        Drawable drawable = null;
        System.out.println("What shape do you want to create");
        String element = scanner.nextLine();
        switch (element) {
            case RECTANGLE_NAME:
                drawable = readAndCreateRectangle();
                break;
            case SQUARE_NAME:
                drawable = readAndCreateSquare();
                break;
            case TREE_NAME:
                drawable = readAndCreateTree();
                break;
            default:
                System.out.println("TThis shape does no exsit");
        }
        return drawable;
    }

    private static Drawable readAndCreateTree() {
        System.out.println("Give me hieht tree ");

        int hieght = scanner.nextInt();

        return new Tree( hieght );
    }

    private static Drawable readAndCreateSquare() {
        System.out.println("Give me side /a/ square ");
        int sideA = scanner.nextInt();

        return new Square( sideA );
    }

    private static Drawable readAndCreateRectangle() {
        System.out.println("Give me side /a/ rectangle ");
        int sideA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Give me side /b/ rectangle ");
        int sidaB = scanner.nextInt();
        return new Rectangle( sideA, sidaB );
    }

}
