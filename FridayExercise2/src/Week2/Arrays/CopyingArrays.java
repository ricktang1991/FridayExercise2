package Week2.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        String array1 = "";
        String array2 = "";
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += (int) (Math.random() * 100);
        }
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        arr1[arr1.length - 1] = -7;

        for (int i = 0; i < arr1.length; i++) {
            array1 += " " + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            array2 += " " + arr2[i];
        }



        System.out.println("Array 1:" + array1);
        System.out.println("Array 2:" + array2);
    }
}
