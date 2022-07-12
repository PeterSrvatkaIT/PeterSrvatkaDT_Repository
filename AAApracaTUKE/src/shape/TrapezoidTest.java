package shape;

public class TrapezoidTest<size2> extends Shape {

    int size, size2;

    public <size2> TrapezoidTest(int size, int size2) {
        this.size = size;
        this.size2 = size2;

    }

    public TrapezoidTest(int size, int size2, char color) {
        super(color);
        this.size = size;
        this.size2 = size2;

    }

    @Override       // define square
    public String toString() {
        String s = "trapezoid\n";
        for (int j = 0; j < size; j++) {

            for (int i = 0; i < size2; i++) {
                s += super.color;
                s += "  ";
            }

            s += "\n";
            s += "  ".repeat(j + 1);

        }

        return s;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
