package ClassicProblem;

/**
 *题目17：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 *程序分析：采取逆向思维的方法，从后往前推断
 */
public class MonkeyEatPeach {
    public static void main(String[] args) {
        int n = getPeachNumber(10);
        System.out.println(n);
    }

    //获取day天前有多少桃子
    private static int getPeachNumber(int day){
        if(day == 0) return 1;
        else return ((getPeachNumber(day-1))+1)*2;
    }
}
