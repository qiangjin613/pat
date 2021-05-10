import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1092 最好吃的月饼 (20 分)
 */
public class Main_1092_超时 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        // 记录每种月饼的销售额
        int[] kind = new int[n];
        int max = 0;
        // 录入数据并找出销售额最多的值
        while (m-- != 0) {
            input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                kind[i] += Integer.parseInt(input[i]);
                if (max < kind[i]) {
                    max = kind[i];
                }
            }
        }
        // 查找输出最大销售额和月饼类别
        System.out.println(max);
        boolean flag = false;
        for (int i = 0; i < kind.length; i++) {
            if (kind[i] == max) {
                System.out.format("%s%d", flag ? " " : "", i + 1);
                flag = true;
            }
        }
    }
}
