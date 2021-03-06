package ClassicProblem;

/**
 *题目11：有1、2、3、4,4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 *程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
public class Array {
    public static void main(String[] args) {
        printArrayNumber();

        /*for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(j == i) continue;
                for(int k=1; k<=4; k++){
                    if(k == j || k == i) continue;
                    System.out.print(i*100 + j*10 + k + ",");
                }
            }
        }*/
    }

    private static void printArrayNumber() {
        int count = 0;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                for(int k = 1; k <= 4; k++) {
                    if(i != j && i!= k && j!= k) {
                        int number = i*100+j*10+k;
                        System.out.print(number+" ");
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
