package nowcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 14:57
 * @Description: 题目描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
 * 输入
 * 复制
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * 输出
 * 复制
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineNum = in.nextInt();
        String[] strs = new String[lineNum];
        for(int i=0;i<lineNum;i++){
            String s = in.next();
            strs[i]=s;
        }
        Arrays.sort(strs);
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
