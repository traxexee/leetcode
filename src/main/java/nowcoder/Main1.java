package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/16 23:15
 * @Description: 题目描述
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 *
 * 输入描述:
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述:
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 *
 * 示例1
 * 输入
 * 复制
 * hello nowcoder
 * 输出
 * 复制
 * 8
 */
public class Main1 {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        String str =scanner.nextLine();
        String[] s=  str.split(" ");
        int len =s[s.length-1].length();
        System.out.println(len+"");
    }
}
