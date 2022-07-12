package shape;

public class RhombusTest<size2> extends Shape {

    int size, size2;

    public <size2> RhombusTest(int size) {
        this.size = size;


    }

    public RhombusTest(int size,  char color) {
        super(color);
        this.size = size;


    }

    @Override       // define square
    public String toString() {
        String s = "rhombus\n";
        for (int j = 0; j < size; j++) {

            for (int i = 0; i < size; i++) {
                s += super.color;
                s += "   ";
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
