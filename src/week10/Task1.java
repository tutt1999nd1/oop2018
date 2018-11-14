package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public String delComent(File path) {
        String code = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (line.contains("//")) {
                    code += line.substring(0, line.indexOf("//")) + "\n";
                } else {
                    if (!line.contains("//")) code += line + "\n";
                }
                if (line.contains("/*")) {
                    code += line.substring(0, line.indexOf("/*")) + "\n";
                }

                if (line.contains("*/")) {
                    code += line.substring(line.indexOf("*/") + 2) + "\n";
                }
            }
        } catch (Exception e) {
        }

        return code;
    }
    public String getFunctions(String code, int begin) {
        int m = 0;
        int d = 0;
        int length = code.length();
        for (int i = begin; i < length; i++) {
            if (code.charAt(i) == '{') m++;
            if (code.charAt(i) == '}') d++;
            if (m == d && m != 0) {
                return code.substring(begin, i + 1);
            }
        }

        return null;
    }

    public List<String> getAllFunctions(File path) {
        List<String> result = new ArrayList<>();

       String code=delComent(path);


        int start = code.indexOf("public static");

        while (start != -1) {
            String line = getFunctions(code, start);
            result.add(line);
            start = code.indexOf("public static", start + 1);
        }

        return result;
    }
    public String getNameFuns(String code, int begin) {
        int m = 0;
        int d = 0;
        int length = code.length();
        for (int i = begin; i < length; i++) {
            if (code.charAt(i) == '(') m++;
            if (code.charAt(i) == ')') d++;
            if (m == d && m != 0) {
                return code.substring(begin, i + 1);
            }
        }

        return null;
    }
    public String findFunctionByName(String name) {
        File file= new File("C:\\Users\\Truong Thanh Tu\\Desktop\\oop2018\\src\\week9\\Utils.java");
        String code = delComent(file);
        String funs = "";
        if(name.contains(",")) {
            String[] Name = name.split("\\(");
            String[] NameSplit = Name[1].split(",");
            String[] nameSplit = NameSplit[1].split("\\)");


            int pos = code.indexOf(Name[0]);
            String nameFuns = getNameFuns(code, pos);

            String[] namefuns = nameFuns.split("\\(");
            String[] parameter = namefuns[1].split(",");
            String[] Parameter = parameter[1].split("\\)");


            if ((parameter[0].contains(NameSplit[0])) == true && (Parameter[0].contains(nameSplit[0])) == true) {
                funs = getFunctions(code, code.indexOf(nameFuns));
               funs = "public static File " + funs;

            } else System.out.println("Khong tim thay");
        }
        else {
            String[] Name = name.split("\\(");
            String[] nameSplit = Name[1].split("\\)");

            int pos = code.indexOf(Name[0]);
            String nameFuns = getNameFuns(code, pos);

            String[] namefuns = nameFuns.split("\\(");
            String[] Parameter = namefuns[1].split("\\)");

            if(Parameter[0].contains(nameSplit[0])){
                funs = getFunctions(code, code.indexOf(namefuns[0]));
               if (Name[0].equals(("readContentFromFile"))) funs = "public static String " + funs;
                else funs = "public static void " + funs;
            }else System.out.println("khong tim thay");

        }
        return funs;
    }
    public static void main(String []a){
        Task1 task1= new Task1();
        File file= new File("C:\\Users\\Truong Thanh Tu\\Desktop\\oop2018\\src\\week9\\Utils.java");

//        for(int i=0;i<task1.getAllFunctions(file).size();i++){
//            System.out.println(task1.getAllFunctions(file).get(i));
//        }
////        System.out.println(task1.delComent(file));
        System.out.println(task1.findFunctionByName("readContentFromFile(String)"));
//        System.out.println(task1.findFunctionByName("writeContentToFile(String)"));
//        System.out.println(task1.findFunctionByName("writeContentToFile2(String)"));
//        System.out.println(task1.findFunctionByName("findFileByName(String,String)"));

    }
}