package nowcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 14:07
 * @Description: 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 * 输入描述:
 * 输入一个int型整数
 *
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 示例1
 * 输入
 * 复制
 * 9876673
 * 输出
 * 复制
 * 37689
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        Set<Integer> s= new HashSet<Integer>();
        while(true){
            Integer b = a%10;
            if(!s.contains(b)){  System.out.print(b);}
            s.add(b);
            if(a>10){
                a =a/10;
            }else{
                break;
            }

        }


    }
}
