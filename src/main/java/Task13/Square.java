package Task13;

public class Square implements Drawable {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < a; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
