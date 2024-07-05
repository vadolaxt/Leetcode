package solutions.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    //    public static int[] twoSum(int[] nums, int target) {
//        int[] rs = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    rs[0] = i;
//                    rs[1] = j;
//                }
//            }
//        }
//        return rs;
//    }

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> setInt = new HashSet<>();
        int i;
        int[] arr = new int[2];

        for (i = 0; i < nums.length; i++) {
            if (setInt.contains(target - nums[i])) {
                break;
            }
            setInt.add(nums[i]);
        }

        for (int j = 0; j < i; j++) {
            if (target - nums[i] == nums[j]) {
                arr[0] = i;
                arr[1] = j;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 7, 11, 15};
        int[] a2 = {3, 2, 4};
        int[] a3 = {3, 3};
        System.out.println(Arrays.toString(twoSum(a1, 9)));
        System.out.println(Arrays.toString(twoSum(a2, 6)));
        System.out.println(Arrays.toString(twoSum(a3, 6)));
    }
}
