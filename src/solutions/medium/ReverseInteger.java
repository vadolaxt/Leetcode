package solutions.medium;

public class ReverseInteger {
    public static int reverse(int x) {
        long rs = 0; // use long to avoid the limit of int
        int sign = x > 0 ? 1 : -1;
        x = Math.abs(x);
        int len = String.valueOf(x).length() - 1;
        while (x > 0) {
            rs += Math.pow(10, len) * (x % 10);
            x /= 10;
            len--;
        }
        if (rs > Integer.MAX_VALUE || rs < Integer.MIN_VALUE) {
            // contraints of problem (see in package problems.medium.7.Reverse Integer)
            rs = 0;
        }
        return (int) rs * sign;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(-1234));
        System.out.println(reverse(1534236469));

    }
}
