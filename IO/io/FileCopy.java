package io;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        if(args.length != 2) {
            System.err.println("Usage java " + FileCopy.class.getCanonicalName() + " <source> <dest>");
            System.exit(-1);
        }
        
        InputStream is = new FileInputStream(args[0]);
        OutputStream os = new FileOutputStream(args[1]);
        
        int b;
        while((b = is.read()) != -1) {
            os.write(b);
        }
         
        is.close();
        os.close();
    }
}
