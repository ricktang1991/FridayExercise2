package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (int) (Math.random() * 100);
            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }
}
