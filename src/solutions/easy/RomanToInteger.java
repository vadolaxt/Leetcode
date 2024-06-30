package solutions.easy;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int ans = 0;
        int pre = 0;
        int num = 0;
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            switch (arr[i]) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num < pre) {
                ans -= num;
            } else {
                ans += num;
            }
            pre = num; //sau khi so sánh thì cập nhật pre
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XVIII"));
        System.out.println(romanToInt("XIV"));
    }
}