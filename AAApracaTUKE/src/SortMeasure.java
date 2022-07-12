import java.util.Arrays;
import java.util.Random;

public class SortMeasure {


    private static long startTime;
    private static long endTime;
    private static int iteration = 0;

    public static void main(String[] args) {


        recordStart();
        //fill array

        int[] randomArrayA = new int[10];
        Random r = new Random();
        for (int i = 0; i < randomArrayA.length; i++) {
            randomArrayA[i] = r.nextInt(100);
            //System.out.print(randomArray[i] + " ");
        }
        recordAndWriteEnd();
        //sort by java
        //int[] randomArrayB = new int[10];
        int[] randomArrayB = randomArrayA.clone();
   //     randomArrayB = randomArrayA;
        for (int i = 0; i < randomArrayA.length; i++) {
            System.out.print("a:"+randomArrayA[i] + " b:" + randomArrayB[i] + " ");
        }
        recordStart();
        Arrays.sort(randomArrayA);
        recordAndWriteEnd();
        System.out.println(" ");
        for (int i = 0; i < randomArrayA.length; i++) {
            System.out.print("a:"+randomArrayA[i] + " b:" + randomArrayB[i] + " ");
        }

        // Bubble sort
//        int backup;
//        for (int i = 0; i < randomArrayB.length; i++) {
//            for (int j = 0; j < randomArrayB.length; j++) {
//                if (randomArrayB[j - 1] > randomArrayB[j]) {
//                    backup = randomArrayB[j - 1];
//                    randomArrayB[j] = backup;
//                }
//
//
//            }
//
//        }
        for (int i = 0; i < randomArrayA.length; i++) {
            System.out.print(randomArrayA[i] + " " + randomArrayB[i] + " ");

        }


//    private static void generateItems(LinkedList<Integer> list) {
//        System.out.println("Generating items");
//        for (int i = 0; i < 100000; i++) { // test different size
//            list.add(new Integer(i));
//        }
        //       System.out.println("Items generated");
    }

    private static void recordStart() {
        startTime = System.currentTimeMillis();
    }

    private static void recordAndWriteEnd() {
        endTime = System.currentTimeMillis();
        System.out.println("Loop " + ++iteration + " duration: "
                + (endTime - startTime) + " milliseconds");
    }
}