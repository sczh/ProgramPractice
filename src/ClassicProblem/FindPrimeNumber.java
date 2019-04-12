package ClassicProblem;

/**
 *题目2：判断101-200之间有多少个素数，并输出所有素数。
 *程序分析：判断素数的方法：用一个数分别去除2-sqrt(n)或者2-n/2,常用2-n/2.
 *一个数的一半的平方大于其本身是从5开始的，解方程：n/2的平方>n.如果能被整除，
 *则表明此数不是素数，反之是素数。
 */
public class FindPrimeNumber {
    public static void main(String[] args) {
        int count = 0;//素数记录器
        for(int i = 101; i <= 200; i++) {
            if(isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static boolean isPrimeNumber(int number){
        if(number == 2) return true;

        for(int i = 2; i <= number/2; i++) {
            int remainder = number % i;
            if(remainder == 0)
                return false;
        }
        return true;
    }
}
