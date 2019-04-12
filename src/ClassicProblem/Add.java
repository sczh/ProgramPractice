package ClassicProblem;

import java.util.Scanner;

/**
 *题目8：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如
 * 2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 *程序分析：关键是计算出每一项的值。
 */
public class Add {
    public static void main(String[] args) {
        System.out.println("输入格式：a,n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] st = str.split(",");
        int ans = getAddSum(Integer.parseInt(st[0]), Integer.parseInt(st[1]));
        System.out.println(ans);
    }

    private static int getAddSum(int a, int n) {
        int ans = 0;
        int aNumber = 0;//每一项的值(上一项的值)
        for(int i = 0; i < n; i++) {
            int temp = a * (int)Math.pow(10,i);//a*10^i
            aNumber += temp;//本项的值 = 上一项的值 + a*10^i
            ans += aNumber;
        }
        return ans;
    }
}
