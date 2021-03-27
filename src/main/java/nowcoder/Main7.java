package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/17 23:38
 * @Description: 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述:
 * 输入一个正浮点数值
 *
 * 输出描述:
 * 输出该数值的近似整数值
 *
 * 示例1
 * 输入
 * 5.5
 * 输出
 * 6
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

        double num=in.nextDouble();
        int n  =(int)  (num+0.5)/1;
        System.out.println(n);

    }
}
