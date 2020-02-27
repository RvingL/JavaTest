package com.example;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        File file = new File("d:/LOLFolder/lol.txt");
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ) {
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File file = new File("d:/LOLFolder/lol.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        ) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeUTF("123 this is Rving");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
