package com.example;
import java.io.RandomAccessFile;

public class PipeTest {
    static RandomAccessFile pipe;
    static String str;
    public static void main(String[] args) {
        str = "This is a test! Output me!";
        try {
            Runtime.getRuntime().exec("mkfifo foo");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            pipe = new RandomAccessFile("foo", "rw");
            pipe.write(str.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
