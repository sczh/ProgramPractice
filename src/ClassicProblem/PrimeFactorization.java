package ClassicProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *题目4：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 *程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 *(1)运用两层循环
 *(2)外循环得到2~n之间的所有质数，内循环将n循环除以质数，直到不能整除
 *(3)要是内循环n等于1了就说明n被完全整除了
 */
public class PrimeFactorization {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        int n = 0;
        try {
            n = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        decompositionPrint(n);
    }

    private static void decompositionPrint(int n) {
        System.out.print(n+"=");
        for(int i = 2; i <= n; i++) {//外循环得到2~n之间的所有质数
            if(isPrimeNumber(i)) {
                while(n % i == 0) {//内循环将n循环除以质数，直到不能整除
                    n = n / i;
                    //控制输出格式
                    if(n == 1)
                        System.out.print(i);
                      else
                        System.out.print(i+"*");
                }
            }
        }
    }

    private static boolean isPrimeNumber(int number){
        for(int i = 2; i <= number/2; i++) {
            int remainder = number % i;
            if(remainder == 0)
                return false;
        }
        return true;
    }
}
