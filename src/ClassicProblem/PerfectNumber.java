package ClassicProblem;

/**
 *题目9：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 * 例如6=1＋2＋3.编程 找出1000以内的所有完数。
 */
public class PerfectNumber {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            if(isPerfectNumber(i))
                System.out.print(i + " ");
        }

    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return (sum == number);
    }
}
