package Week2.ArrayLists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int count = 0;
        while (count < 10) {
            num.add((int) (Math.random()*100));
            count++;
        }
        System.out.println("ArrayList: " + num);

    }

}
