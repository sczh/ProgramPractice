package ClassicProblem;

/**
 *题目13：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 *程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，
 * 即是结果。
 */
public class PerfectSquare {
    public static void main(String[] args){
        for(long i = 0; i < 100000; i++) {
            if(isPerfectSquare(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPerfectSquare(long number) {
        return (Math.sqrt(number+100) % 1 == 0 && Math.sqrt(number+268) % 1 == 0);
    }
}
