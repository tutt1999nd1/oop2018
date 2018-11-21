package week11;


public class Task1 {


    public static <T extends Comparable> void sortArr(T[]a) {

        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j+1].compareTo(a[j])<=0)
                {
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                }

    public static void main(String[] args) {
//        Character a[] = {'a','c','b'};
//        sortArr(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        Integer a[] = {1,3,2,5,4};
        sortArr(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }}


