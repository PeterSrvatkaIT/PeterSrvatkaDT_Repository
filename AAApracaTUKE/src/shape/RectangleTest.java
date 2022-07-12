package shape;

public class RectangleTest<size2> extends Shape{

    int size, size2;
    public <size2> RectangleTest(int size,int size2) {
        this.size = size;
        this.size2=size2;
    }

    public RectangleTest(int size,int size2, char color) {
        super(color);
        this.size = size;
        this.size2=size2;
    }

    @Override       // define square
    public String toString() {
        String s = "rectangle\n";
        for (int j = 0; j < size2; j++) {


            for (int i = 0; i < size; i++) {
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
