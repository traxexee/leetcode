package nowcoder;

import java.util.Scanner;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 14:59
 * @Description: 题目描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * 输入描述:
 *  输入一个整数（int类型）
 *
 * 输出描述:
 *  这个数转换成2进制后，输出1的个数
 *
 * 示例1
 * 输入
 * 复制
 * 5
 * 输出
 * 复制
 * 2v
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i=0;
        while(true){
            if(a%2==1){
                i++;
            }
            a=a/2;
            if(a==0){
                break;
            }
        }
        System.out.println(i);

    }
}
