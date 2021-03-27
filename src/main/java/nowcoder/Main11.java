package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/17 0:03
 * @Description: 题目描述
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 *
 * 示例1
 * 输入
 * 复制
 * 1516000
 * 输出
 * 复制
 * 0006151
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
ss(number);
    }
    private static  void ss(int num){
        System.out.print(num%10);
        num=num/10;
        if (num!=0){
            ss(num);

        }
    }
}
