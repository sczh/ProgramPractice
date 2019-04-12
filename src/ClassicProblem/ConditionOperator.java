package ClassicProblem;


import java.util.Scanner;

/**
 *题目5：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
 * 60分以下的用C表示。
 *程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class ConditionOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scorce = sc.nextInt();
        sc.close();
        System.out.println(gradeClassification(scorce));
    }

    private static char gradeClassification(int scorce) {
        return (scorce >= 90) ? 'A' : ((scorce >= 60) ? 'B' : 'C');
    }
}
