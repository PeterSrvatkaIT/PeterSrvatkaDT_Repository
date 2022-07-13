package shape;

public class SquareTestUseStringAppend extends Shape {

    int size;

    public SquareTestUseStringAppend(int size) {
        this.size = size;
    }

    public SquareTestUseStringAppend(int size, char color) {
        super(color);
        this.size = size;
    }

    @Override       // define square
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("String to String square\n");
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                sb.append(super.color).append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
