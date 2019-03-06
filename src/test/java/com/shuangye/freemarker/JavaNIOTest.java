package com.shuangye.freemarker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * create by xxie
 * on 2019/1/21
 */
public class JavaNIOTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("D:\\login.txt","rw");
        FileChannel fc = file.getChannel();
        ByteBuffer bf = ByteBuffer.allocate(1024);
        int bytes = fc.read(bf);

        while(bytes != -1){
            System.out.println(bytes);
            bf.flip();
            while(bf.hasRemaining()){
                System.out.print((char)bf.get());
            }
            bf.clear();
            bytes = fc.read(bf);
        }
        fc.close();
        file.close();
    }
}
