package week7.task2;

import java.io.*;

public class Task2 {
}
class NullPointerExceptiontest {
    public static void NullPointerException(String a) throws NullPointerException {
        if (a != null) {
            System.out.println(a.toString());
        } else
            throw new NullPointerException("lỖI ĐỔI NULL String");
    }

    public static void main(String[] argc)  {
        try {
            String a = null;
            NullPointerException(a);
       }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

}
}
class ArrayIndexOfBoundExceptiontest {
    public static void ArrayIndexOfBoundException(int[] a, int b) throws ArrayIndexOutOfBoundsException {
        if (a.length > b) {
            a[b] = 0;
        } else throw new ArrayIndexOutOfBoundsException("Khong ton tai vi tri trong mang");
    }

    public static void main(String[] argc) {
        try {
            int a[] = new int[5];
            int b = 6;
            ArrayIndexOfBoundException(a, b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
class ArithmeticExceptiontest {
    public static void ArithmaticException(double a, double b) {
        if (b != 0)
            System.out.println(a / b);
//         throw new ArithmeticException("Lỗi chia cho 0");
    }

    public static void main(String[] argc) {
        try {
            ArithmaticException(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
class ClassCastExceptiontest {
    public static void classCastException(Object a, String b) throws ClassCastException {
        if (b != (String) a) {
            System.out.println("A");
        } else {
            throw new ClassCastException("String không thuộc phân lớp integer");

        }
    }

    public static void main(String[] argc) {
        try {
            classCastException("42", "42");
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

    }
}
class FileNotFoundExceptiontest {
    public static void FileNotFoundException()throws FileNotFoundException{
        FileReader f = new FileReader("test.txt");}
    public static void main(String[] argv) {
        try {
            FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage());
        }
    }
}
class IOExceptiontest {
    public static void IOException()throws IOException{
        FileReader f = new FileReader("test.txt");}
    public static void main(String[] argv) throws IOException{
        try {
        IOException();
        } catch (IOException e) {
        System.out.println( e.getMessage());
        }
    }
}