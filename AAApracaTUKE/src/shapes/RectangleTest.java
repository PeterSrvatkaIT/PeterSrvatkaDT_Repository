package shapes;

public class SquareTest extends Shape{

    int size;
    public SquareTest(int size) {
        this.size = size;
    }

    public SquareTest( int size,char color) {
        super(color);
        this.size = size;
    }

    @Override       // define square
    public String toString() {
        String s = "square\n";
        for (int j = 0; j < size; j++) {


            for (int i = 0; i < size; i++) {
                s += super.color;
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
