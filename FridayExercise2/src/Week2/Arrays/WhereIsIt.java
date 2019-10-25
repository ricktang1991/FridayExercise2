package Week2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String array = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] += (int) (Math.random() * 50);
            array += " " + arr[i];
        }
        System.out.println("Array:" + array);
        Scanner scan = new Scanner(System.in);
        System.out.print("Value to find: ");
        int guess = scan.nextInt();
        System.out.println();
        if (array.contains(Integer.toString(guess))) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == guess) {
                    System.out.println(guess + " is in slot " + i);
                }
            }
        } else {
            System.out.println(guess + " is not in the array");
        }
    }
}
