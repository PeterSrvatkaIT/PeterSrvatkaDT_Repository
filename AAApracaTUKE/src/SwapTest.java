public class SwapTest {
    public static void main(String[] args) {

        int a = 4; //5
        int b = 5; //4
        SwapTest.swap(a,b);
//        swap(a, b);



        System.out.println(a + " " + b);
    }


    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}
