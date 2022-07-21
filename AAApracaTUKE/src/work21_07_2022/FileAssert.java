package work21_07_2022;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FileAssert {
    public static void main(String[] args) {
        walkin(new File("C:\\Users\\student\\Desktop\\5o S folder\\Minesweeper03")); //Replace this with a suitable directory
    }

    /**
     * Recursive function to descend into the directory tree and find all the files
     *
     * @param dir A file object defining the top directory
     **/
    public static void walkin(File dir) {

        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    System.out.println("|\t\t");
                    walkin(listFile[i]);
                } else {

                    System.out.println("+---" + listFile[i].getName().toString());

                }
            }
        }
    }
}