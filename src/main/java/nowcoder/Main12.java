package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 14:33
 * @Description: 题目描述
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入描述:
 * 输入一行，为一个只包含小写字母的字符串。
 *
 * 输出描述:
 * 输出该字符串反转后的字符串。
 *
 * 示例1
 * 输入
 * 复制
 * abcd
 * 输出
 * 复制
 * dcba
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        char[] cs =s.toCharArray();
        for(int i=cs.length-1;i>-1;i--){
            System.out.print(cs[i]);
        }
    }
}
