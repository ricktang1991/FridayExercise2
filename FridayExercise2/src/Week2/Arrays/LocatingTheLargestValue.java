package Week2.Arrays;

import java.util.Arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String array = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (int) (Math.random() * 50);
            array += " " + arr[i];
        }
        System.out.println("Array:" + array);
        System.out.println();
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The largest value is " + max);
        System.out.println("It is in slot " + index);
    }
}
