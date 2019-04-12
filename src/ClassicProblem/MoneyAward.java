package ClassicProblem;

import java.util.Scanner;

/**
 *题目12：企业发放的奖金根据利润提成。
 *利润(I)低于或等于10万元时，奖金可提10%；
 *利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 *20万到40万之间时，高于20万元的部分，可提成5%；
 *40万到60万之间时高于40万元的部分，可提成3%；
 *60万到100万之间时，高于60万元的部分，可提成1.5%，
 *高于100万元时，超过100万元的部分按1%提成，
 *从键盘输入当月利润I，求应发放奖金总数？
 *程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 */
public class MoneyAward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float I = sc.nextFloat();
        sc.close();
        System.out.println(getMoneyAward(I));

    }

    private static float getMoneyAward(float I) {
        float moneyAward = 0;
        if(I <= 10) {
            moneyAward = I * 0.1f;
        } else if(I < 20) {
            moneyAward = 10 * 0.1f + (I - 10) * 0.075f;
        } else if(I < 40) {
            moneyAward = (I - 20) * 0.05f;
        } else if(I < 60) {
            moneyAward = (I - 40) * 0.03f;
        } else if(I < 100) {
            moneyAward = (I - 60) * 0.015f;
        } else {
            moneyAward = (I - 100) * 0.01f;
        }
        return moneyAward;
    }
}
