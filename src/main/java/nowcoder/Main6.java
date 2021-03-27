package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/17 22:56
 * @Description: 题目描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 *
 * 输入描述:
 * 输入一个long型整数
 *
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 *
 * 示例1
 * 输入
 * 复制
 * 180
 * 输出
 * 复制
 * 2 2 3 3 5
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            long a = in.nextLong();
            num(a);
        }
    }
    public static void num(long num){
        if(num ==1 ){
            return;
        }
       //重点
        long k = (long) Math.sqrt(num);
        for (int i=2;i<=k ;i++){
            if( num%i ==0){
                System.out.print(i+" ");
                num =num/i;
                i=1;

            }
        }
        if(num !=1 ){
            System.out.print(num+" ");
        }
    }
}
