package Week2.ArrayLists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int count = 0;
        while (count < 10) {
            num.add((int) (Math.random() * 100));
            count++;
        }
        System.out.println("ArrayList: " + num);
        System.out.println();
        int max = 0;
        for (int value : num) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("The largest value is " + max);
    }
}
