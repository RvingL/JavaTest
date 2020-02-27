package com.example;

import javax.print.DocFlavor;
import java.io.*;

public class StreamExam {
    public static void main(String[] args) {
        String srcFile = "d:/LOLFolder/lol5.txt";
        String destFile = "d:/LOLFolder/lol6.txt";
        fileCopy(srcFile, destFile);
    }

    public static void fileCopy(String srcFile, String destFile) {
        File file = new File(srcFile);
        File file1 = new File(destFile);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                FileOutputStream fileOutputStream = new FileOutputStream(file1);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            byte[] b = new byte[(int) file.length()];
            bufferedInputStream.read(b);
            for (byte b1 : b) {
                System.out.println(b1);
            }

            if (b != null) {
                bufferedOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
