import java.util.Scanner;

/**
 * 1016 部分A+B (15 分)
 */
public class Main_1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long dA = in.nextLong();
        long b = in.nextLong();
        long dB = in.nextLong();

        System.out.print(deal(a, dA) + deal(b, dB));
    }

    static long deal(long a, long dA) {
        long pA = 0;
        while (a != 0) {
            if (a % 10 == dA) {
                pA = pA * 10 + dA;
            }
            a /= 10;
        }
        return pA;
    }
}

/**
 * 出现超时，也可能因平台提交人数过多导致，待进一步提交测试
 */
class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String dA = in.next();
        String b = in.next();
        String dB = in.next();

        System.out.print(deal(a, dA) + deal(b, dB));
    }

    public static long deal(String a, String dA) {
        long pA = 0;
        char c = dA.charAt(0);
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            if (aChar == c) {
                pA = pA * 10 + (c - '0');
            }
        }
        return pA;
    }
}