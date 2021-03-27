package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/16 23:16
 * @Description: 题目描述
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
 *
 * 输入描述:
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 * 复制
 * ABCabc
 * A
 * 输出
 * 复制
 * 2
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = scanner.nextLine();
        str=  str.toUpperCase();
        s = s.toUpperCase();
        char sc=s.toCharArray()[0];
        char[] sl=str.toCharArray();

        int num =0;
        for(int i=0;i<sl.length;i++){
            if(sc==sl[i]){
                num++;
            }

        }
        System.out.println(num);
    }
}
