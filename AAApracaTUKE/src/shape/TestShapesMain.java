package shape;

public class TestShapesMain {

    public static void main(String[] args) {
        Shape[] shapes = {
//                new Line(3),
                new Line(5, '#'),
//                new SquareTest(10,'x'),
                new SquareTest(5),
                new RectangleTest(5,3),
//                new RectangleTest(2,6,'+'),
//                new TriangleTest<>(5),
                new TriangleTest<>(4,'$'),
                new TrapezoidTest(5,9, '-'),
                new RhombusTest<>(8,'o')

                //, new Rectangle(10, 8), new Triangle(5), new Square(8), ...
                //should print whatever shape there is, just needs to extend Shape
        };

        for (Shape s: shapes) {
            s.print();
        }
    }
}