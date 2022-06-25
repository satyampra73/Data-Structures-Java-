package ArraysAndArrayList;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 45;
        arr[3] = 23;
        arr[4] = 34;

        System.out.println(arr[2]);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
