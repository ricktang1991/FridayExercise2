package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int count = 0;
        while (count < 10) {
            num.add((int) (Math.random()*50));
            count++;
        }
        System.out.println("ArrayList: " + num);
        System.out.print("Value to find: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        System.out.println();
        if (num.contains(guess)) {
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) == guess) {
                    System.out.println(guess + " is in slot " + i);
                }
            }
        } else {
            System.out.println(guess + " is not in the ArrayList");
        }
    }
}
