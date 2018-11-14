package week10;



public class Task2 {


    public static void bubbleSort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    public static void main(String []argc){
        int a[]= new int[1000];
        for(int i=0;i<a.length;i++){
            a[i]=1 + (int)(Math.random() * ((1000 - 1) + 1));
        }
        bubbleSort(a);
        for (int i=0;i<1000;i++){
            System.out.println(a[i]+" ");
        }

    }


}
