package solutions.easy;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ls.add(arr[i]);
            } else if (ls.size() >= 3) {
                break;
            } else {
                ls.clear();
            }
        }
        return ls.size() >= 3 ? true : false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {5, 7, 23};
        int[] arr3 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        int[] arr4 = {823, 384, 282, 984, 218, 3, 127, 227, 55, 266};
        System.out.println(threeConsecutiveOdds(arr1));
        System.out.println(threeConsecutiveOdds(arr2));
        System.out.println(threeConsecutiveOdds(arr3));
        System.out.println(threeConsecutiveOdds(arr4));

    }
}
