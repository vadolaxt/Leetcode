package solutions.easy;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int prev = 0, num = 0, ans = 0;
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
            // Nếu số hiện tại nhỏ hơn số liền kề bên phải
            if (num < prev) {
                ans -= num;
                // Nếu số hiện tại lớn hơn hoặc bằng số liền kề bên phải
            } else {
                ans += num;
            }
            prev = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("XVIII"));
        System.out.println(romanToInt("XIV"));
    }
}