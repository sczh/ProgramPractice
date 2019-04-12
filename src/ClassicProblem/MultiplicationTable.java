package ClassicProblem;

/**
 *题目16：输出9*9口诀。
 *程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        printTable();
    }

    private static void printTable(){
        for(int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+j*i);
                if(i*j < 10)
                    System.out.print("   ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
