package ACcode;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
/**
 题目描述:给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大。
 要求时间复杂度：O(n)，空间复杂度：O(1)
 输入描述: 数组大小 n
         无序整数数组A[n]
 输出描述:满足条件的最大乘积
 示例1:输入   4
             3 4 1 2
      输出    24
 分析:Max = 最后三个数乘积 或者 最后一个数与最前两个数乘积
 */
public class  MaxMultiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");

        BigInteger[] arr = new BigInteger[n];
        for(int i=0; i<str.length; i++) {
            arr[i] = new BigInteger(str[i]);
        }
        Arrays.sort(arr);

        BigInteger a = arr[n-1].multiply(arr[n-2].multiply(arr[n-3]));
        BigInteger b = arr[n-1].multiply(arr[0].multiply(arr[1]));
        if(a.compareTo(b) == -1)
            System.out.println(b);
        else
            System.out.println(a);
    }
}