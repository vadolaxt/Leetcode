package solutions.easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else {
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                        /**
                         * dkien 1: nếu chữ thứ 2 ngắn hơn chữ thứ 1 thì prefix trả về từ 0 tới vị trí của i
                         * dkien 2: nếu chữ tại vtri i của chữ thứ j trong mảng giống chữ tại vtri i của chữ thứ 1 thì tiếp tục
                         * sang chữ tại vtri tiếp theo đến khi ko còn giống nhau nữa
                         */
                        return strs[0].substring(0, i);
                    }
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String s1[] = {"flower", "flow", "flight"};
        String s2[] = {"dog", "racecar", "car"};
        String s3[] = {"ab", "a"};

        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
        System.out.println(longestCommonPrefix(s3));

    }
}
