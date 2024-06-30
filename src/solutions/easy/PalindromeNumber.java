
package solutions.easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

//        if (x < 0) {
//            return false;
//        } else {
//            int[] arr = new int[String.valueOf(x).length()];
//            int count = 0;
//            while (x > 0) {
//                arr[count] = x % 10;
//                x = x / 10;
//                count++;
//            }
//
//            for (int i = 0; i < arr.length / 2; i++) {
//                if (arr[i] != arr[arr.length -i- 1]) {
//                    return false;
//                }
//            }
//            return true;
//        }

        if (x < 0) {
            return false;
        } else {
            int origin = x;
            int reminder;
            int reversed = 0;
            while (x != 0) {
                reminder = x % 10;
                reversed = reversed * 10 + reminder;
                x /= 10;
            }
            if (origin == reversed) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122341));
        System.out.println(isPalindrome(1001));


    }
}
