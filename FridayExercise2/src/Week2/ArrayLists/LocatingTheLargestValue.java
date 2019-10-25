package Week2.ArrayLists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
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
        int index = 0;
        for (int i = 0; i < num.size(); i++) {
            if (max < num.get(i)) {
                max = num.get(i);
                index = i;
            }

        }
        System.out.println("The largest value is " + max + ", which is in slot " + index);
    }
}
