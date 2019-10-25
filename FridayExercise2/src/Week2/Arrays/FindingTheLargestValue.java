package Week2.Arrays;

public class FindingTheLargestValue {
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
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("The largest value is " + max);
    }
}
