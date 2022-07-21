package work21_07_2022;

import java.io.File;

public class ListDirTest {

    public static void main(String[] args) {

        File zaciatok = new File(".");
        listDir(zaciatok);
    }
    public static void listDir(File zaciatok) {
        int counter = 0;
            File listFile[] = zaciatok.listFiles();
            {
                if (listFile != null) {
                    for (int i = 0; i < listFile.length; i++) {
                        if (listFile[i].isDirectory()) {
                            System.out.print("---");
                            listDir(listFile[i]);

                        }
                        else {
                            System.out.println("+" + listFile[i].getName().toString());
                        }

                    }

                }
            }


    }


}



