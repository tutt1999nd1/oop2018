package week9;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.ArrayList;

public class Utils {
    public static String readContentFromFile(String path ) {
        File file = new File("public static hh.txt");
        String str = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            str = new String(data, "UTF-8");
        } catch (IOException e) {}
        return str;
    }

    public static void writeContentToFile(String path ){
        File file = new File(path);
        String s = "hello1";
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter a = new PrintWriter(fileWriter);
            a.print(s);
            a.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }
    public static void writeContentToFile2(String path ) {
        File file = new File(path);

            try {
                FileWriter fileWriter= new FileWriter(file,true);
                PrintWriter out = new PrintWriter(new BufferedWriter(fileWriter));
                out.print("\n");
                out.print("helll2");
                out.close();
            } catch (IOException e) {}
    }


    public static synchronized File findFileByName(String folderPath, String fileName )throws NullPointerException{
        File find= new File(folderPath);
        String d= null;
        for (File file : find.listFiles()) {
            if (file.getName().equals(fileName)) {
                d=folderPath+"\\"+file.getName();}
        } return  new File(d);

    }

}