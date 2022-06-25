package ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    //operations on array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 4;
//        arr[2] = 45;
//        arr[3] = 23;
//        arr[4] = 34;

//

// taking the integer input in array

//        for(int i=0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }

//printing it

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//using for each loop

//        for(int j:arr){
//            System.out.print(j+" ");
//        }

//taking the string array input

        String[] stArr = new String[4];

        for (int i = 0; i < stArr.length; i++) {
            stArr[i] = sc.next();
        }

        for(String str:stArr){
            System.out.print(str+" ");
        }

//printing string array with the help of to string method

        System.out.print(Arrays.toString(stArr));



    }
}
