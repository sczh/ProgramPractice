package ClassicProblem;

/**
 *题目6：输入两个正整数m和n，求其最大公约数和最小公倍数。
 *1.程序分析：利用辗除法。
 *2.辗转相除法基于如下原理：两个整数的最大公约数等于其中较小的数和两数的相除余数的最大公约数。
 *3.最小公倍数等于两数之积除以最大公约数
 */
public class GCDAndLCM {
    public static void main(String[] args) {
        int[] result = getGAL(10, 5);
        System.out.println(result[0] + "," + result[1]);
    }

    private static int[] getGAL(int m, int n) {//普通方法
        int[] result = new int[2];
        int index = m > n ? n : m;
        for (int i = index; i > 0; i--) {
            if(m % i == 0 && n % i == 0) {
                result[0] = i;
                result[1] = i * (m/i) * (n/i);
                break;
            }
        }
        return result;
    }

   /* //最大公约数辗转相除法
    public static int getGCD(int m, int n){//最大公约数辗转相除法
        if(m%n == 0) return n;
        else return getGCD(n, m%n);//递归辗转相除
    }

    //最小公倍数
    public static int getLCM(int m, int n){
        return (m * n)/getGCD(m, n);//最小公倍数等于两数之积除以最大公约数
    }*/
}
