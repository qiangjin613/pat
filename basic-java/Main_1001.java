import java.util.Scanner;

/**
 * 1001 害死人不偿命的(3n+1)猜想 (15分)
 */
public class Main_1001 {
    public static void main(String[] args) {
        // 速度有些慢
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n != 1) {
            if (n % 2 == 0) { // 偶数，砍一半
                n = n / 2;
            } else { // 奇数 (3*n+1) 后再砍一半
                n = (3 * n + 1) / 2;
            }
            cnt ++;
        }
        System.out.print(cnt);
    }
}
