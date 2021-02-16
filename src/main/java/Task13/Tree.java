package Task13;

public class Tree implements Drawable {
    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void draw() {
        int spaces = height - 1;
        int stars = 1;
        for (int i = 0; i < height; i++) {
            printSpaces(spaces);
            printStars(stars);
            System.out.println();
            spaces--;
            stars+=2;
        }

    }

    private void printStars(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
    }

    private void printSpaces(int spaces) {
        System.out.print(" ");
    }
}
