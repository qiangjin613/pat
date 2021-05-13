import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 1038 统计同成绩学生 (20 分)
 */
public class Main_1038 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 这里可以忽略学生总数 N 直接读取第二行数据即可
        br.readLine();
        String[] input = br.readLine().split(" ");
        // stats[i] 代表分数为 i 的学生数有多少个
        int[] stats = new int[101];
        for (int i = 0; i < input.length; i++) {
            int index = Integer.parseInt(input[i]);
            stats[index]++;
        }
        // 输出结果：
        boolean flag = false;
        input = br.readLine().split(" ");
        for (int i = 1, len = Integer.parseInt(input[0]); i < len + 1; i++) {
            int index = Integer.parseInt(input[i]);
            System.out.format("%s%d", flag ? " " : "", stats[index]);
            flag = true;
        }
    }


    /**
     * 采用 Map 避免的 String -> 的转换，还是会超时
     */
    public static void main02(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 这里可以忽略学生总数 N 直接读取第二行数据即可
        br.readLine();
        String[] input = br.readLine().split(" ");
        Map<String, Integer> stats = new HashMap<>();
        for (int i = 0, len = input.length; i < len; i++) {
            Integer count = stats.get(input[i]);
            if (count == null) {
                stats.put(input[i], 1);
            } else {
                stats.replace(input[i], ++count);
            }
        }
        // 输出结果：
        boolean flag = false;
        input = br.readLine().split(" ");
        for (int i = 1, len = Integer.parseInt(input[0]); i < len + 1; i++) {
            Integer count = stats.get(input[i]);
            if (count == null) {
                System.out.format("%s%d", flag ? " " : "", 0);
            } else {
                System.out.format("%s%d", flag ? " " : "", count);
            }
            flag = true;
        }
    }
}
