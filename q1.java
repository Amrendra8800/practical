/**
 * q1
 */
class cube {

    private int x = 5;

    void show() {
        System.out.println("cube is " + (x * x * x));
        square s1 = new square();
        s1.clac();
    }

    private class square {
        private int y = 10;

        void clac() {
            System.out.println("square is " + y * y);
        }
    }

}

public class q1 {

    public static void main(String[] args) {
        cube c1 = new cube();
        c1.show();
    }
}