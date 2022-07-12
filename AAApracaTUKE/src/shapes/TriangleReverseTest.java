package shapes;

public class TriangleTest<size2> extends Shape{

    int size, size2;
    public <size2> TriangleTest(int size) {
        this.size = size;

    }

    public TriangleTest(int size, char color) {
        super(color);
        this.size = size;

    }

    @Override       // define square
    public String toString() {
        String s = "triangle\n";
        for (int j = 0; j < size; j++) {


            for (int i = 0; i < j+1; i++) {
                s += super.color;
                s +="  ";
            }
            s+="\n";

        }
        return s;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
