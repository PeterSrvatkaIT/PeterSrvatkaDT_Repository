

public class PointTest {
    public static void main(String[] args) {
        Point p1= new Point(4,5);
        Point p2=p1;

        p1.move (10,10); //referencia!!

        System.out.println (p1);
        System.out.println (p2);

    }
}
