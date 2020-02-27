package com.example;

import java.io.*;

public class TestBufferStream {
    public static void main(String[] args) {
        File file = new File("d:/LOLFolder/lol3.txt");
        write(file);
        read(file);
    }

    public static void write(File file) {
        try (
                FileWriter fileReader = new FileWriter(file);
                PrintWriter printWriter = new PrintWriter(fileReader);
        ) {
            String str = "31@18";
            printWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(File file) {
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String str = bufferedReader.readLine();
            String[] str1 = str.split("@");
            for (String s : str1) {
                System.out.println(Integer.valueOf(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
