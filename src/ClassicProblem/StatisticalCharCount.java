package ClassicProblem;

/**
 *题目7：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 *程序分析：利用循环,使用Map存储数据.其实完全可以使用4个变量来解决,这边舍近求远复习下Map啦
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StatisticalCharCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int[] result = getCharCount(str);
        for(int i = 0; i < result.length; i++)
            System.out.print(result[i]+" ");

        /*BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        String str1 = null;
        try {
            str1 = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<Integer, Integer> m = countChar(str);
        Set<Integer> keys = m.keySet();
        Iterator<Integer> it = keys.iterator();
        int n, k;
        while(it.hasNext()){
            k = it.next();
            n = m.get(k);
            switch (k) {
                case 1:
                    System.out.println("英文字母: "+n);
                    break;
                case 2:
                    System.out.println("空格: "+n);
                    break;
                case 3:
                    System.out.println("数字: "+n);
                    break;
                case 4:
                    System.out.println("其它字符: "+n);
                    break;
                default:
                    break;
            }
        }*/
    }

    private static int[] getCharCount(String str) {
        int[] result = new int[4];
        int englishLetters = 0;
        int blank = 0;
        int digital = 0;
        int otherChar = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i]>='a'&ch[i]<='z' | ch[i]>='A'&ch[i]<='Z')
                englishLetters++;
            else if(ch[i] == ' ')
                blank++;
            else if(ch[i]>='0'&ch[i]<='9')
                digital++;
            else
                otherChar++;
        }
        result[0] = englishLetters;
        result[1] = blank;
        result[2] = digital;
        result[3] = otherChar;
        return result;
    }

    /*public static Map<Integer, Integer> countChar(String str){
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 0);
        m.put(2, 0);
        m.put(3, 0);
        m.put(4, 0);
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
                m.put(1, m.get(1) + 1);
            else if(ch[i] == ' ')
                m.put(2, m.get(2) + 1);
            else if(ch[i] >= '0' && ch[i] <= '9')
                m.put(3, m.get(3) + 1);
            else
                m.put(4, m.get(4) + 1);
        }
        return m;
    }*/
}
