package Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exam1 {
    public static void search(String folder,String search){
        File[] files=((new File(folder)).listFiles());
        for(File file:files){
            if(file.isDirectory()){
                search(file.getPath(),search);
            }
            if(file.isFile() && file.getName().endsWith(".java")){
                Thread thread=new Thread() {
                    @Override
                    public void run() {
                        try(
                                FileReader fileReader=new FileReader(file);
                                BufferedReader bufferedReader=new BufferedReader(fileReader);
                        )
                        {
                            String line;
                            while(null!=(line=bufferedReader.readLine())){
                                if(line.contains("Hero")){
                                    System.out.println("在"+file+"中找到了"+search);
                                    break;
                                }
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
        }
    }

    public static void main(String[] args) {
        String filePath ="D:/Iproject/Ex/src";
        search(filePath,"Hero");
    }
}
