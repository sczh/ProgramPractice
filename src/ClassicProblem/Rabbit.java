package ClassicProblem;

import java.util.Scanner;

/**
 *题目1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的总兔子对数为多少？
 *程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21...
 */
public class Rabbit {
    public static void main(String[] args) {
        //输入月份
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();

        //调用getRabbitNumber()方法
        for(int i = 1; i <= month; i++ )
            System.out.print(getRabbitNumber(i) + " ");
    }


    //获取本月兔子数的方法
    private static int getRabbitNumber(int month) {
        if(month == 1 || month == 2)
            return 1;
        else
            return getRabbitNumber(month-1) + getRabbitNumber(month-2);
    }
}
