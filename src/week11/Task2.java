package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static <T extends Comparable<T>> T max(ArrayList<T> data) {
        T max=data.get(0);
        int n = data.size();
        for (int i = 0; i < n; i++){
            if (data.get(i).compareTo(max) > 0) {
                max = data.get(i);
            }
        }return max;
    }

    public static void main(String[] args) {
        ArrayList <Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        System.out.println(max(a));

    }
}