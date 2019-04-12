package ClassicProblem;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 题目15：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class ThreeNumberSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = getSort(100,568, 213);
        for(Integer i :list) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> getSort(int x, int y, int z) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(z);
        Collections.sort(list);
        return list;
    }
}
