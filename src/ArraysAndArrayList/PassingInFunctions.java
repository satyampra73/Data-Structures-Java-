package ArraysAndArrayList;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {23, 4, 5, 65, 12};

        System.out.println(Arrays.toString(arr));

//changing the zero index of array via function that shows that arrays are mutable in java and can be changed

        Change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Change(int arr[]) {
        arr[0] = 78;
    }

}
