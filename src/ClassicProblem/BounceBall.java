package ClassicProblem;

/**
 *题目10：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，
 * 共经过多少米？第10次反弹多高？
 */
public class BounceBall {
    public static void main(String[] args) {
        float[] result = getBallparameter(100, 2);
        System.out.println(result[0] + " " + result[1]);
    }

    private static float[] getBallparameter(int StarAltitude, int n) {
        float[] result = new float[2];
        float journey = 0;
        float reboundHeight = StarAltitude;
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                journey = reboundHeight;//第一次落地路程是起始高度
            } else {
                journey += reboundHeight * 2;//以后每次落地路程是弹跳高度*2
            }
            reboundHeight = reboundHeight / 2;//每次弹跳高度是前一次弹跳高度/2
        }
        result[0] = journey;
        result[1] =reboundHeight;
        return result;
    }
}
