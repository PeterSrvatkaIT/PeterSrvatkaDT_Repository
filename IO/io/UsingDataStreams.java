package io;

import java.io.*;

public class UsingDataStreams {
    public static void main(String[] args) throws IOException {
        int i = 10;
        double d = 12.4;
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("out.bin"));
        dos.writeInt(i);
        dos.writeDouble(d);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("out.bin"));
        i = dis.readInt();
        d = dis.readDouble();
        dis.close();
        
        System.out.println(i + " " + d);
    }
}
