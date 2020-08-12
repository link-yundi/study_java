package ch07.math;

/**
 * @author zhangyundi
 */

public class Cal {
    static int a = Math.abs(5);
    static int b = Math.abs(-10);

    // ceil 进行向上舍入
    static double c = Math.ceil(6.231);
    static double d = Math.floor(6.231);

    static int m = Math.max(5, 10);
    static int n = Math.min(5, 10);

    static double p = Math.pow(2, 3);

    public static void main(String[] args) {
        System.out.printf("%d, %d, %.1f, %.1f, %d, %d, %f", a, b, c, d, m, n, p);
    }
}