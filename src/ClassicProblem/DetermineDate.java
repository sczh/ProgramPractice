package ClassicProblem;

import java.util.Scanner;

/**
 *题目14：输入某年某月某日，判断这一天是这一年的第几天？
 *程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class DetermineDate {
    public static void main(String[] args) {
        System.out.println("日期格式：xxxx/xx/xx (年/月/日)");
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("/");
        sc.close();
        System.out.println(getTotalDay(Integer.parseInt(date[0]), Integer.parseInt(date[1]),
                Integer.parseInt(date[2])));
    }

    private static int getTotalDay(int year, int month, int day) {
        int[] monthTable = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0)
            monthTable[1] = 29;
        int totalDay = 0;
        for(int i = 0; i < month -1; i++)
            totalDay += monthTable[i];
        totalDay += day;
        return totalDay;
    }
}
